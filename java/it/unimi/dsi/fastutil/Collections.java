/*		 
 * fastutil: Fast & compact type-specific collections for Java
 *
 * Copyright (C) 2002, 2003 Sebastiano Vigna 
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */

package it.unimi.dsi.fastutil;

import it.unimi.dsi.fastutil.booleans.*;
import it.unimi.dsi.fastutil.bytes.*;
import it.unimi.dsi.fastutil.shorts.*;
import it.unimi.dsi.fastutil.chars.*;
import it.unimi.dsi.fastutil.ints.*;
import it.unimi.dsi.fastutil.longs.*;
import it.unimi.dsi.fastutil.floats.*;
import it.unimi.dsi.fastutil.doubles.*;
import it.unimi.dsi.fastutil.objects.*;

import java.util.Collection;
import java.util.Iterator;

import it.unimi.dsi.fastutil.Iterators;
import it.unimi.dsi.fastutil.Arrays;


/** A class providing static methods that do useful things with collections.
 *
 * @see Collections
 */

public class Collections {

	private Collections() {}

	protected abstract static class EmptyCollection extends AbstractObjectCollection implements 
	   BooleanCollection, ByteCollection, ShortCollection, IntCollection, LongCollection, CharCollection,
	   FloatCollection, DoubleCollection, ObjectCollection, ReferenceCollection {
		
		protected EmptyCollection() {}

		public boolean add( boolean k ) { throw new UnsupportedOperationException(); }
		public boolean add( byte k ) { throw new UnsupportedOperationException(); }
		public boolean add( char k ) { throw new UnsupportedOperationException(); }
		public boolean add( short k ) { throw new UnsupportedOperationException(); }
		public boolean add( int k ) { throw new UnsupportedOperationException(); }
		public boolean add( long k ) { throw new UnsupportedOperationException(); }
		public boolean add( float k ) { throw new UnsupportedOperationException(); }
		public boolean add( double k ) { throw new UnsupportedOperationException(); }
           
		public boolean addAll( BooleanList c ) { if ( c.isEmpty() ) return false; else throw new UnsupportedOperationException(); }
		public boolean addAll( ByteList c ) { if ( c.isEmpty() ) return false; else throw new UnsupportedOperationException(); }
		public boolean addAll( CharList c ) { if ( c.isEmpty() ) return false; else throw new UnsupportedOperationException(); }
		public boolean addAll( ShortList c ) { if ( c.isEmpty() ) return false; else throw new UnsupportedOperationException(); }
		public boolean addAll( IntList c ) { if ( c.isEmpty() ) return false; else throw new UnsupportedOperationException(); }
		public boolean addAll( LongList c ) { if ( c.isEmpty() ) return false; else throw new UnsupportedOperationException(); }
		public boolean addAll( FloatList c ) { if ( c.isEmpty() ) return false; else throw new UnsupportedOperationException(); }
		public boolean addAll( DoubleList c ) { if ( c.isEmpty() ) return false; else throw new UnsupportedOperationException(); }
           
		public boolean addAll( BooleanCollection c ) { if ( c.isEmpty() ) return false; else throw new UnsupportedOperationException(); }
		public boolean addAll( ByteCollection c ) { if ( c.isEmpty() ) return false; else throw new UnsupportedOperationException(); }
		public boolean addAll( CharCollection c ) { if ( c.isEmpty() ) return false; else throw new UnsupportedOperationException(); }
		public boolean addAll( ShortCollection c ) { if ( c.isEmpty() ) return false; else throw new UnsupportedOperationException(); }
		public boolean addAll( IntCollection c ) { if ( c.isEmpty() ) return false; else throw new UnsupportedOperationException(); }
		public boolean addAll( LongCollection c ) { if ( c.isEmpty() ) return false; else throw new UnsupportedOperationException(); }
		public boolean addAll( FloatCollection c ) { if ( c.isEmpty() ) return false; else throw new UnsupportedOperationException(); }
		public boolean addAll( DoubleCollection c ) { if ( c.isEmpty() ) return false; else throw new UnsupportedOperationException(); }
           
		public boolean removeAll( BooleanCollection c ) { return false; }
		public boolean removeAll( ByteCollection c ) { return false; }
		public boolean removeAll( CharCollection c ) { return false; }
		public boolean removeAll( ShortCollection c ) { return false; }
		public boolean removeAll( IntCollection c ) { return false; }
		public boolean removeAll( LongCollection c ) { return false; }
		public boolean removeAll( FloatCollection c ) { return false; }
		public boolean removeAll( DoubleCollection c ) { return false; }
           
		public boolean containsAll( BooleanCollection c ) { return c.isEmpty(); }
		public boolean containsAll( ByteCollection c ) { return c.isEmpty(); }
		public boolean containsAll( CharCollection c ) { return c.isEmpty(); }
		public boolean containsAll( ShortCollection c ) { return c.isEmpty(); }
		public boolean containsAll( IntCollection c ) { return c.isEmpty(); }
		public boolean containsAll( LongCollection c ) { return c.isEmpty(); }
		public boolean containsAll( FloatCollection c ) { return c.isEmpty(); }
		public boolean containsAll( DoubleCollection c ) { return c.isEmpty(); }
           
		public boolean retainAll( BooleanCollection c ) { return false; }
		public boolean retainAll( ByteCollection c ) { return false; }
		public boolean retainAll( CharCollection c ) { return false; }
		public boolean retainAll( ShortCollection c ) { return false; }
		public boolean retainAll( IntCollection c ) { return false; }
		public boolean retainAll( LongCollection c ) { return false; }
		public boolean retainAll( FloatCollection c ) { return false; }
		public boolean retainAll( DoubleCollection c ) { return false; }
           
		public boolean remove( boolean k ) { return false; }
		public boolean remove( byte k ) { return false; }
		public boolean remove( char k ) { return false; }
		public boolean remove( short k ) { return false; }
		public boolean rem( int k ) { return false; }
		public boolean remove( long k ) { return false; }
		public boolean remove( float k ) { return false; }
		public boolean remove( double k ) { return false; }
           
		public boolean contains( Object k ) { return false; }

		public boolean contains( boolean k ) { return false; }
		public boolean contains( byte k ) { return false; }
		public boolean contains( char k ) { return false; }
		public boolean contains( short k ) { return false; }
		public boolean contains( int k ) { return false; }
		public boolean contains( long k ) { return false; }
		public boolean contains( float k ) { return false; }
		public boolean contains( double k ) { return false; }
           
		public Object[] toArray() { return Arrays.EMPTY_ARRAY; }

		public boolean[] toBooleanArray() { return BooleanArrays.EMPTY_ARRAY; }
		public byte[] toByteArray() { return ByteArrays.EMPTY_ARRAY; }
		public char[] toCharArray() { return CharArrays.EMPTY_ARRAY; }
		public short[] toShortArray() { return ShortArrays.EMPTY_ARRAY; }
		public int[] toIntArray() { return IntArrays.EMPTY_ARRAY; }
		public long[] toLongArray() { return LongArrays.EMPTY_ARRAY; }
		public float[] toFloatArray() { return FloatArrays.EMPTY_ARRAY; }
		public double[] toDoubleArray() { return DoubleArrays.EMPTY_ARRAY; }

		public boolean[] toBooleanArray( boolean[] a ) { return a; }
		public byte[] toByteArray( byte[] a ) { return a; }
		public char[] toCharArray( char[] a ) { return a; }
		public short[] toShortArray( short[] a ) { return a; }
		public int[] toIntArray( int[] a ) { return a; }
		public long[] toLongArray( long[] a ) { return a; }
		public float[] toFloatArray( float[] a ) { return a; }
		public double[] toDoubleArray( double[] a ) { return a; }

		public boolean[] toArray( boolean[] a ) { return a; }
		public byte[] toArray( byte[] a ) { return a; }
		public char[] toArray( char[] a ) { return a; }
		public short[] toArray( short[] a ) { return a; }
		public int[] toArray( int[] a ) { return a; }
		public long[] toArray( long[] a ) { return a; }
		public float[] toArray( float[] a ) { return a; }
		public double[] toArray( double[] a ) { return a; }

		public Iterator iterator() { return Iterators.EMPTY_ITERATOR; }

		public BooleanIterator booleanIterator() { return Iterators.EMPTY_ITERATOR; }
		public ByteIterator byteIterator() { return Iterators.EMPTY_ITERATOR; }
		public CharIterator charIterator() { return Iterators.EMPTY_ITERATOR; }
		public ShortIterator shortIterator() { return Iterators.EMPTY_ITERATOR; }
		public IntIterator intIterator() { return Iterators.EMPTY_ITERATOR; }
		public LongIterator longIterator() { return Iterators.EMPTY_ITERATOR; }
		public FloatIterator floatIterator() { return Iterators.EMPTY_ITERATOR; }
		public DoubleIterator doubleIterator() { return Iterators.EMPTY_ITERATOR; }
		public ObjectIterator objectIterator() { return Iterators.EMPTY_ITERATOR; }
		public ObjectIterator referenceIterator() { return Iterators.EMPTY_ITERATOR; }

		public int size() { return 0; }
		public void clear() {}
	}
}

// Local Variables:
// mode: jde
// tab-width: 4
// End:
