; FUN_0080e3dc @ 0080e3dc
0080e3dc	stp x29,x30,[sp, #-0x50]!
0080e3e0	stp x26,x25,[sp, #0x10]
0080e3e4	stp x24,x23,[sp, #0x20]
0080e3e8	stp x22,x21,[sp, #0x30]
0080e3ec	stp x20,x19,[sp, #0x40]
0080e3f0	mov x29,sp
0080e3f4	ldp x21,x8,[x0, #0x8]
0080e3f8	mov x19,x0
0080e3fc	sub x9,x8,x21
0080e400	cmp x1,x9, ASR #0x4
0080e404	b.ls 0x0080e460
0080e408	ldr x20,[x19]
0080e40c	sub x22,x21,x20
0080e410	asr x25,x22,#0x4
0080e414	add x9,x25,x1
0080e418	lsr x10,x9,#0x3c
0080e41c	cbnz x10,0x0080e500
0080e420	sub x21,x8,x20
0080e424	orr x10,xzr,#0x7ffffffffffffff0
0080e428	asr x8,x21,#0x3
0080e42c	cmp x8,x9
0080e430	csel x8,x8,x9,hi
0080e434	cmp x21,x10
0080e438	mov x9,#0xfffffffffffffff
0080e43c	csel x23,x8,x9,cc
0080e440	cbz x23,0x0080e484
0080e444	lsr x8,x23,#0x3c
0080e448	cbnz x8,0x0080e504
0080e44c	lsl x0,x23,#0x4
0080e450	mov x24,x1
0080e454	bl 0x00c2fed0
0080e458	mov x1,x24
0080e45c	b 0x0080e488
0080e460	cbz x1,0x0080e47c
0080e464	lsl x20,x1,#0x4
0080e468	mov x0,x21
0080e46c	mov w1,wzr
0080e470	mov x2,x20
0080e474	bl 0x00c301c0
0080e478	add x21,x21,x20
0080e47c	str x21,[x19, #0x8]
0080e480	b 0x0080e4e8
0080e484	mov x0,xzr
0080e488	add x26,x0,x23, LSL #0x4
0080e48c	lsl x23,x1,#0x4
0080e490	add x24,x0,x22
0080e494	mov x0,x24
0080e498	mov w1,wzr
0080e49c	mov x2,x23
0080e4a0	bl 0x00c301c0
0080e4a4	sub x25,x24,x25, LSL #0x4
0080e4a8	mov x1,x20
0080e4ac	mov x2,x22
0080e4b0	add x23,x24,x23
0080e4b4	mov x0,x25
0080e4b8	bl 0x00c2ffd0
0080e4bc	stp x25,x23,[x19]
0080e4c0	str x26,[x19, #0x10]
0080e4c4	cbz x20,0x0080e4e8
0080e4c8	mov x0,x20
0080e4cc	mov x1,x21
0080e4d0	ldp x20,x19,[sp, #0x40]
0080e4d4	ldp x22,x21,[sp, #0x30]
0080e4d8	ldp x24,x23,[sp, #0x20]
0080e4dc	ldp x26,x25,[sp, #0x10]
0080e4e0	ldp x29,x30,[sp], #0x50
0080e4e4	b 0x00c2fe80
0080e4e8	ldp x20,x19,[sp, #0x40]
0080e4ec	ldp x22,x21,[sp, #0x30]
0080e4f0	ldp x24,x23,[sp, #0x20]
0080e4f4	ldp x26,x25,[sp, #0x10]
0080e4f8	ldp x29,x30,[sp], #0x50
0080e4fc	ret
0080e500	bl 0x0080e508
0080e504	bl 0x007fe1b8
