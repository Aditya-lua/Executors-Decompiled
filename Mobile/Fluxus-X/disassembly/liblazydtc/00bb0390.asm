; ZSTD_getDecompressedSize @ 00bb0390
00bb0390	sub sp,sp,#0x60
00bb0394	stp x29,x30,[sp, #0x40]
00bb0398	str x19,[sp, #0x50]
00bb039c	add x29,sp,#0x40
00bb03a0	mrs x19,tpidr_el0
00bb03a4	mov x2,x1
00bb03a8	mov x1,x0
00bb03ac	ldr x8,[x19, #0x28]
00bb03b0	add x0,sp,#0x8
00bb03b4	mov w3,wzr
00bb03b8	stur x8,[x29, #-0x8]
00bb03bc	bl 0x00c435f0
00bb03c0	ldr w8,[sp, #0x1c]
00bb03c4	ldr x9,[sp, #0x8]
00bb03c8	cmp w8,#0x1
00bb03cc	csel x8,xzr,x9,eq
00bb03d0	cmp x0,#0x0
00bb03d4	mov x9,#-0x2
00bb03d8	csel x8,x8,x9,eq
00bb03dc	ldr x9,[x19, #0x28]
00bb03e0	ldur x10,[x29, #-0x8]
00bb03e4	cmn x8,#0x3
00bb03e8	csel x0,xzr,x8,hi
00bb03ec	cmp x9,x10
00bb03f0	b.ne 0x00bb0404
00bb03f4	ldp x29,x30,[sp, #0x40]
00bb03f8	ldr x19,[sp, #0x50]
00bb03fc	add sp,sp,#0x60
00bb0400	ret
00bb0404	bl 0x00c2fec0
