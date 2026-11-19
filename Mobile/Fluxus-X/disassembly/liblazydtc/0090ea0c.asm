; FUN_0090ea0c @ 0090ea0c
0090ea0c	str x19,[sp, #-0x20]!
0090ea10	stp x29,x30,[sp, #0x10]
0090ea14	add x29,sp,#0x10
0090ea18	adrp x8,0xcc4000
0090ea1c	add x8,x8,#0x690
0090ea20	mov x19,x1
0090ea24	mov w0,#0x1
0090ea28	mov w1,#0x10
0090ea2c	ldr x8,[x8]
0090ea30	blr x8
0090ea34	str x0,[x19]
0090ea38	ldp x29,x30,[sp, #0x10]
0090ea3c	cmp x0,#0x0
0090ea40	mov w8,#0x1b
0090ea44	csel w8,w8,wzr,eq
0090ea48	mov w0,w8
0090ea4c	ldr x19,[sp], #0x20
0090ea50	ret
