; FUN_0098a358 @ 0098a358
0098a358	str x23,[sp, #-0x40]!
0098a35c	stp x22,x21,[sp, #0x10]
0098a360	stp x20,x19,[sp, #0x20]
0098a364	stp x29,x30,[sp, #0x30]
0098a368	add x29,sp,#0x30
0098a36c	mov x20,x0
0098a370	mov w0,#0x8
0098a374	mov x22,x2
0098a378	mov x23,x1
0098a37c	bl 0x00c2fed0
0098a380	mov x21,x0
0098a384	bl 0x00c2ffa0
0098a388	mov w0,#0x20
0098a38c	bl 0x00c2fed0
0098a390	ldp x8,x9,[x23]
0098a394	ldr x10,[x22]
0098a398	mov x19,x0
0098a39c	stp x21,x8,[x0]
0098a3a0	stp x9,x10,[x0, #0x10]
0098a3a4	adrp x2,0xcb4000
0098a3a8	ldr x2,[x2, #0xfd8]
0098a3ac	mov x0,x20
0098a3b0	mov x1,xzr
0098a3b4	mov x3,x19
0098a3b8	bl 0x00c2ffb0
0098a3bc	cbnz w0,0x0098a3d4
0098a3c0	ldp x29,x30,[sp, #0x30]
0098a3c4	ldp x20,x19,[sp, #0x20]
0098a3c8	ldp x22,x21,[sp, #0x10]
0098a3cc	ldr x23,[sp], #0x40
0098a3d0	ret
0098a3d4	adrp x1,0x2a7000
0098a3d8	add x1,x1,#0x22
0098a3dc	bl 0x00c2ffc0
