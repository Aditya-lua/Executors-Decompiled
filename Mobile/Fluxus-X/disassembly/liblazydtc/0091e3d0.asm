; FUN_0091e3d0 @ 0091e3d0
0091e3d0	stp x20,x19,[sp, #-0x20]!
0091e3d4	stp x29,x30,[sp, #0x10]
0091e3d8	add x29,sp,#0x10
0091e3dc	mov x19,x0
0091e3e0	cbz x0,0x0091e434
0091e3e4	adrp x20,0xcc4000
0091e3e8	add x20,x20,#0x678
0091e3ec	ldr x0,[x19, #0x18]
0091e3f0	ldr x8,[x20]
0091e3f4	blr x8
0091e3f8	ldr x8,[x20]
0091e3fc	ldr x0,[x19, #0x20]
0091e400	blr x8
0091e404	ldr x8,[x20]
0091e408	ldr x0,[x19, #0x28]
0091e40c	blr x8
0091e410	add x0,x19,#0x30
0091e414	bl 0x0091fdcc
0091e418	add x0,x19,#0x68
0091e41c	bl 0x0091fdcc
0091e420	ldr x1,[x20]
0091e424	ldp x29,x30,[sp, #0x10]
0091e428	mov x0,x19
0091e42c	ldp x20,x19,[sp], #0x20
0091e430	br x1
0091e434	ldp x29,x30,[sp, #0x10]
0091e438	ldp x20,x19,[sp], #0x20
0091e43c	ret
