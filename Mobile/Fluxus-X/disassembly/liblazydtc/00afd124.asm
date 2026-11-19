; FUN_00afd124 @ 00afd124
00afd124	sub sp,sp,#0x60
00afd128	stp x20,x19,[sp, #0x40]
00afd12c	stp x29,x30,[sp, #0x50]
00afd130	ldr w8,[x1]
00afd134	str x21,[sp, #0x30]
00afd138	mov w20,w2
00afd13c	mov x21,x1
00afd140	mov x19,x0
00afd144	add x29,sp,#0x50
00afd148	cbz w8,0x00afd1b4
00afd14c	ldr x8,[x21, #0x8]
00afd150	adrp x3,0x2ab000
00afd154	adrp x1,0x2b6000
00afd158	add x3,x3,#0x32c
00afd15c	add w4,w20,#0x2
00afd160	add x1,x1,#0x51d
00afd164	mov x0,x19
00afd168	mov w2,w20
00afd16c	mov x5,x3
00afd170	str x8,[sp, #0x8]
00afd174	bl 0x00c32250
00afd178	mov w3,#0x31f
00afd17c	add x1,sp,#0x8
00afd180	movk w3,#0x82, LSL #16
00afd184	mov x0,x19
00afd188	mov w2,wzr
00afd18c	bl 0x00c32bd0
00afd190	adrp x1,0x2c4000
00afd194	add x1,x1,#0xdae
00afd198	mov x0,x19
00afd19c	bl 0x00c32260
00afd1a0	ldp x29,x30,[sp, #0x50]
00afd1a4	ldp x20,x19,[sp, #0x40]
00afd1a8	ldr x21,[sp, #0x30]
00afd1ac	add sp,sp,#0x60
00afd1b0	ret
00afd1b4	adrp x1,0x2c2000
00afd1b8	adrp x3,0x2ab000
00afd1bc	add x1,x1,#0x514
00afd1c0	add x3,x3,#0x32c
00afd1c4	mov x0,x19
00afd1c8	mov w2,w20
00afd1cc	bl 0x00c32250
00afd1d0	ldr x1,[x21, #0x8]
00afd1d4	mov x0,x19
00afd1d8	mov w2,w20
00afd1dc	ldp x29,x30,[sp, #0x50]
00afd1e0	ldp x20,x19,[sp, #0x40]
00afd1e4	ldr x21,[sp, #0x30]
00afd1e8	add sp,sp,#0x60
00afd1ec	b 0x00afd2b0
00afd2b0	str x25,[sp, #-0x50]!
00afd2b4	stp x20,x19,[sp, #0x30]
00afd2b8	mov x20,x0
00afd2bc	mov x0,x1
00afd2c0	stp x24,x23,[sp, #0x10]
00afd2c4	stp x22,x21,[sp, #0x20]
00afd2c8	stp x29,x30,[sp, #0x40]
00afd2cc	add x29,sp,#0x40
00afd2d0	mov w21,w2
00afd2d4	mov x19,x1
00afd2d8	bl 0x00c325e0
00afd2dc	cmp w0,#0x1
00afd2e0	b.lt 0x00afd394
00afd2e4	add w21,w21,#0x2
00afd2e8	adrp x1,0x2bb000
00afd2ec	adrp x3,0x2ab000
00afd2f0	add x1,x1,#0x9d8
00afd2f4	add x3,x3,#0x32c
00afd2f8	mov x0,x20
00afd2fc	mov w2,w21
00afd300	bl 0x00c32250
00afd304	mov x0,x19
00afd308	mov w1,wzr
00afd30c	bl 0x00c32610
00afd310	mov x1,x0
00afd314	mov x0,x20
00afd318	bl 0x00c3f070
00afd31c	mov x0,x19
00afd320	bl 0x00c325e0
00afd324	cmp w0,#0x2
00afd328	b.lt 0x00afd394
00afd32c	adrp x23,0x2c4000
00afd330	adrp x24,0x2bb000
00afd334	adrp x25,0x2ab000
00afd338	mov w22,#0x1
00afd33c	add x23,x23,#0xdae
00afd340	add x24,x24,#0x9d8
00afd344	add x25,x25,#0x32c
00afd348	mov x0,x20
00afd34c	mov x1,x23
00afd350	bl 0x00c32260
00afd354	mov x0,x20
00afd358	mov x1,x24
00afd35c	mov w2,w21
00afd360	mov x3,x25
00afd364	bl 0x00c32250
00afd368	mov x0,x19
00afd36c	mov w1,w22
00afd370	bl 0x00c32610
00afd374	mov x1,x0
00afd378	mov x0,x20
00afd37c	bl 0x00c3f070
00afd380	mov x0,x19
00afd384	add w22,w22,#0x1
00afd388	bl 0x00c325e0
00afd38c	cmp w22,w0
00afd390	b.lt 0x00afd348
00afd394	ldp x29,x30,[sp, #0x40]
00afd398	ldp x20,x19,[sp, #0x30]
00afd39c	ldp x22,x21,[sp, #0x20]
00afd3a0	ldp x24,x23,[sp, #0x10]
00afd3a4	ldr x25,[sp], #0x50
00afd3a8	ret
