; FUN_00bcb424 @ 00bcb424
00bcb424	paciasp
00bcb428	sub sp,sp,#0x50
00bcb42c	stp x29,x30,[sp, #0x20]
00bcb430	str x21,[sp, #0x30]
00bcb434	stp x20,x19,[sp, #0x40]
00bcb438	add x29,sp,#0x20
00bcb43c	mov x19,x1
00bcb440	ldr w1,[x0]
00bcb444	mov x20,x8
00bcb448	cbz w1,0x00bcb4b4
00bcb44c	ldrb w8,[x19]
00bcb450	ldr x9,[x19, #0x8]
00bcb454	mov x21,x0
00bcb458	lsr x10,x8,#0x1
00bcb45c	tst w8,#0x1
00bcb460	csel x8,x10,x9,eq
00bcb464	cbz x8,0x00bcb47c
00bcb468	adrp x1,0x2d4000
00bcb46c	add x1,x1,#0xf75
00bcb470	mov x0,x19
00bcb474	bl 0x00c30430
00bcb478	ldr w1,[x21]
00bcb47c	ldr x0,[x21, #0x8]
00bcb480	ldr x8,[x0]
00bcb484	ldr x9,[x8, #0x30]
00bcb488	add x8,sp,#0x8
00bcb48c	blr x9
00bcb490	add x1,sp,#0x8
00bcb494	mov x0,x19
00bcb498	bl 0x0081f6dc
00bcb49c	ldrb w8,[sp, #0x8]
00bcb4a0	tbz w8,#0x0,0x00bcb4b4
00bcb4a4	ldr x8,[sp, #0x8]
00bcb4a8	ldr x0,[sp, #0x18]
00bcb4ac	and x1,x8,#-0x2
00bcb4b0	bl 0x00c2fe80
00bcb4b4	ldr q0,[x19]
00bcb4b8	ldr x8,[x19, #0x10]
00bcb4bc	stp xzr,xzr,[x19, #0x8]
00bcb4c0	str q0,[x20]
00bcb4c4	str x8,[x20, #0x10]
00bcb4c8	str xzr,[x19]
00bcb4cc	ldp x20,x19,[sp, #0x40]
00bcb4d0	ldr x21,[sp, #0x30]
00bcb4d4	ldp x29,x30,[sp, #0x20]
00bcb4d8	add sp,sp,#0x50
00bcb4dc	autiasp
00bcb4e0	ret
