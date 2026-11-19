; FUN_0092f788 @ 0092f788
0092f788	str x21,[sp, #-0x30]!
0092f78c	stp x20,x19,[sp, #0x10]
0092f790	stp x29,x30,[sp, #0x20]
0092f794	add x29,sp,#0x20
0092f798	ldr x20,[x0]
0092f79c	mov x19,x0
0092f7a0	cbz x20,0x0092f804
0092f7a4	ldr x8,[x20, #0x38]
0092f7a8	cbz x8,0x0092f7b8
0092f7ac	ldr x0,[x20, #0x30]
0092f7b0	blr x8
0092f7b4	stp xzr,xzr,[x20, #0x30]
0092f7b8	add x0,x20,#0x10
0092f7bc	mov x1,xzr
0092f7c0	bl 0x00925e04
0092f7c4	adrp x21,0xcc4000
0092f7c8	add x21,x21,#0x678
0092f7cc	ldr x0,[x20]
0092f7d0	ldr x8,[x21]
0092f7d4	blr x8
0092f7d8	str xzr,[x20]
0092f7dc	ldr x8,[x21]
0092f7e0	ldr x0,[x20, #0x8]
0092f7e4	blr x8
0092f7e8	mov w8,#0x1
0092f7ec	str xzr,[x20, #0x8]
0092f7f0	strb w8,[x20, #0x40]
0092f7f4	ldr x8,[x21]
0092f7f8	mov x0,x20
0092f7fc	blr x8
0092f800	str xzr,[x19]
0092f804	ldp x29,x30,[sp, #0x20]
0092f808	ldp x20,x19,[sp, #0x10]
0092f80c	ldr x21,[sp], #0x30
0092f810	ret
