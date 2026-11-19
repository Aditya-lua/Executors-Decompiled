; ix::CaseInsensitiveLess::cmp @ 0098b388
0098b388	stp x24,x23,[sp, #-0x40]!
0098b38c	stp x22,x21,[sp, #0x10]
0098b390	stp x20,x19,[sp, #0x20]
0098b394	stp x29,x30,[sp, #0x30]
0098b398	add x29,sp,#0x30
0098b39c	ldrb w8,[x0]
0098b3a0	ldp x10,x9,[x0, #0x8]
0098b3a4	ldrb w11,[x1]
0098b3a8	tst w8,#0x1
0098b3ac	csinc x21,x9,x0,ne
0098b3b0	ldp x9,x12,[x1, #0x8]
0098b3b4	lsr w8,w8,#0x1
0098b3b8	csel x22,x8,x10,eq
0098b3bc	lsr w8,w11,#0x1
0098b3c0	tst w11,#0x1
0098b3c4	csel x23,x8,x9,eq
0098b3c8	csinc x24,x12,x1,ne
0098b3cc	cbz x23,0x0098b410
0098b3d0	cbz x22,0x0098b418
0098b3d4	ldrb w0,[x21]
0098b3d8	ldrb w20,[x24]
0098b3dc	bl 0x00c30f10
0098b3e0	mov w19,w0
0098b3e4	mov w0,w20
0098b3e8	bl 0x00c30f10
0098b3ec	cmp w19,w0
0098b3f0	b.lt 0x0098b418
0098b3f4	cmp w0,w19
0098b3f8	b.lt 0x0098b410
0098b3fc	add x21,x21,#0x1
0098b400	add x24,x24,#0x1
0098b404	subs x23,x23,#0x1
0098b408	sub x22,x22,#0x1
0098b40c	b.ne 0x0098b3d0
0098b410	mov w0,wzr
0098b414	b 0x0098b41c
0098b418	mov w0,#0x1
0098b41c	ldp x29,x30,[sp, #0x30]
0098b420	ldp x20,x19,[sp, #0x20]
0098b424	ldp x22,x21,[sp, #0x10]
0098b428	ldp x24,x23,[sp], #0x40
0098b42c	ret
