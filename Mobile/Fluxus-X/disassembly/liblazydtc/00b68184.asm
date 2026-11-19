; ossl_gcm_one_shot @ 00b68184
00b68184	str x23,[sp, #-0x40]!
00b68188	stp x22,x21,[sp, #0x10]
00b6818c	stp x20,x19,[sp, #0x20]
00b68190	stp x29,x30,[sp, #0x30]
00b68194	ldr x8,[x0, #0xf0]
00b68198	add x29,sp,#0x30
00b6819c	mov x19,x6
00b681a0	mov x21,x5
00b681a4	ldr x8,[x8, #0x10]
00b681a8	mov x22,x4
00b681ac	mov x23,x3
00b681b0	mov x20,x0
00b681b4	blr x8
00b681b8	cbz w0,0x00b68204
00b681bc	ldr x8,[x20, #0xf0]
00b681c0	mov x0,x20
00b681c4	mov x1,x23
00b681c8	mov x2,x22
00b681cc	ldr x8,[x8, #0x18]
00b681d0	mov x3,x21
00b681d4	blr x8
00b681d8	cbz w0,0x00b68204
00b681dc	ldr x8,[x20, #0xf0]
00b681e0	mov w9,#0x10
00b681e4	str x9,[x20, #0x18]
00b681e8	mov x0,x20
00b681ec	ldr x8,[x8, #0x20]
00b681f0	mov x1,x19
00b681f4	blr x8
00b681f8	cmp w0,#0x0
00b681fc	cset w0,ne
00b68200	b 0x00b68208
00b68204	mov w0,wzr
00b68208	ldp x29,x30,[sp, #0x30]
00b6820c	ldp x20,x19,[sp, #0x20]
00b68210	ldp x22,x21,[sp, #0x10]
00b68214	ldr x23,[sp], #0x40
00b68218	ret
