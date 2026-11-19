; FUN_00aa513c @ 00aa513c
00aa513c	sub sp,sp,#0x50
00aa5140	stp x29,x30,[sp, #0x40]
00aa5144	ldr x8,[x0, #0x18]
00aa5148	str x19,[sp, #0x30]
00aa514c	mov x19,x0
00aa5150	add x29,sp,#0x40
00aa5154	cbz x8,0x00aa51ec
00aa5158	ldr x1,[x19]
00aa515c	adrp x0,0x2b8000
00aa5160	add x0,x0,#0x53
00aa5164	add x8,sp,#0x8
00aa5168	mov x2,xzr
00aa516c	bl 0x00c36280
00aa5170	ldr x8,[sp, #0x28]
00aa5174	ldr x1,[x19, #0x8]
00aa5178	adrp x0,0x2d6000
00aa517c	add x0,x0,#0x51
00aa5180	str x8,[x19, #0x40]
00aa5184	ldur q0,[sp, #0x18]
00aa5188	add x8,sp,#0x8
00aa518c	mov x2,xzr
00aa5190	str q0,[x19, #0x30]
00aa5194	ldur q0,[sp, #0x8]
00aa5198	str q0,[x19, #0x20]
00aa519c	bl 0x00c36280
00aa51a0	ldr x8,[sp, #0x28]
00aa51a4	ldr x1,[x19, #0x10]
00aa51a8	adrp x0,0x2a4000
00aa51ac	add x0,x0,#0x429
00aa51b0	str x8,[x19, #0x68]
00aa51b4	ldur q0,[sp, #0x18]
00aa51b8	add x8,sp,#0x8
00aa51bc	mov x2,xzr
00aa51c0	stur q0,[x19, #0x58]
00aa51c4	ldur q0,[sp, #0x8]
00aa51c8	stur q0,[x19, #0x48]
00aa51cc	bl 0x00c36280
00aa51d0	ldr x8,[sp, #0x28]
00aa51d4	str x8,[x19, #0x90]
00aa51d8	ldur q0,[sp, #0x18]
00aa51dc	orr w8,wzr,#0x3
00aa51e0	str q0,[x19, #0x80]
00aa51e4	ldur q0,[sp, #0x8]
00aa51e8	str q0,[x19, #0x70]
00aa51ec	mov w9,#0x28
00aa51f0	madd x19,x8,x9,x19
00aa51f4	add x8,sp,#0x8
00aa51f8	bl 0x00c34c40
00aa51fc	ldr x8,[sp, #0x28]
00aa5200	str x8,[x19, #0x40]
00aa5204	ldur q0,[sp, #0x18]
00aa5208	str q0,[x19, #0x30]
00aa520c	ldur q0,[sp, #0x8]
00aa5210	str q0,[x19, #0x20]
00aa5214	ldp x29,x30,[sp, #0x40]
00aa5218	ldr x19,[sp, #0x30]
00aa521c	add sp,sp,#0x50
00aa5220	ret
