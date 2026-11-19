; std::__ndk1::collate<wchar_t>::do_compare @ 00bda214
00bda214	bti c
00bda218	cmp x3,x4
00bda21c	b.eq 0x00bda250
00bda220	cmp x1,x2
00bda224	b.eq 0x00bda25c
00bda228	ldr w8,[x1]
00bda22c	ldr w9,[x3]
00bda230	cmp w8,w9
00bda234	b.cc 0x00bda25c
00bda238	cmp w9,w8
00bda23c	b.cc 0x00bda264
00bda240	add x3,x3,#0x4
00bda244	add x1,x1,#0x4
00bda248	cmp x3,x4
00bda24c	b.ne 0x00bda220
00bda250	cmp x1,x2
00bda254	cset w0,ne
00bda258	ret
00bda25c	mov w0,#0xffffffff
00bda260	ret
00bda264	mov w0,#0x1
00bda268	ret
