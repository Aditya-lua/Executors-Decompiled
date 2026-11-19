; ZSTD_readSkippableFrame @ 00bb0158
00bb0158	mov x8,x0
00bb015c	cmp x4,#0x8
00bb0160	mov x0,#-0x48
00bb0164	b.cc 0x00bb0210
00bb0168	stp x29,x30,[sp, #-0x30]!
00bb016c	str x21,[sp, #0x10]
00bb0170	stp x20,x19,[sp, #0x20]
00bb0174	mov x29,sp
00bb0178	ldp w20,w9,[x3]
00bb017c	mov w11,#0xd2a5
00bb0180	movk w11,#0x184, LSL #16
00bb0184	add x10,x9,#0x8
00bb0188	cmp x10,x4
00bb018c	csel x10,x0,x10,hi
00bb0190	cmn w9,#0x9
00bb0194	mov x0,#-0xe
00bb0198	csel x9,x0,x10,hi
00bb019c	cmp w11,w20, LSR #0x4
00bb01a0	b.ne 0x00bb0204
00bb01a4	cmp x9,x4
00bb01a8	b.ls 0x00bb01b4
00bb01ac	mov x0,#-0x48
00bb01b0	b 0x00bb0204
00bb01b4	sub x0,x9,#0x8
00bb01b8	cmp x0,x1
00bb01bc	b.ls 0x00bb01c8
00bb01c0	mov x0,#-0x46
00bb01c4	b 0x00bb0204
00bb01c8	cbz x8,0x00bb01f0
00bb01cc	cbz x0,0x00bb01f0
00bb01d0	mov x19,x0
00bb01d4	add x1,x3,#0x8
00bb01d8	mov x0,x8
00bb01dc	mov x21,x2
00bb01e0	mov x2,x19
00bb01e4	bl 0x00c2ffd0
00bb01e8	mov x2,x21
00bb01ec	mov x0,x19
00bb01f0	cbz x2,0x00bb0204
00bb01f4	mov w8,#0xd5b0
00bb01f8	movk w8,#0xe7b2, LSL #16
00bb01fc	add w8,w20,w8
00bb0200	str w8,[x2]
00bb0204	ldp x20,x19,[sp, #0x20]
00bb0208	ldr x21,[sp, #0x10]
00bb020c	ldp x29,x30,[sp], #0x30
00bb0210	ret
