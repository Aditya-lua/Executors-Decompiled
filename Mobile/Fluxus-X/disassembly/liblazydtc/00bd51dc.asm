; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::putback @ 00bd51dc
00bd51dc	paciasp
00bd51e0	stp x29,x30,[sp, #-0x30]!
00bd51e4	str x21,[sp, #0x10]
00bd51e8	stp x20,x19,[sp, #0x20]
00bd51ec	mov x29,sp
00bd51f0	ldr x8,[x0]
00bd51f4	mov w21,w1
00bd51f8	mov x19,x0
00bd51fc	ldur x9,[x8, #-0x18]
00bd5200	str xzr,[x0, #0x8]
00bd5204	ldur x8,[x8, #-0x18]
00bd5208	add x9,x0,x9
00bd520c	ldr w9,[x9, #0x20]
00bd5210	add x0,x0,x8
00bd5214	and w20,w9,#0xfffffffd
00bd5218	mov w1,w20
00bd521c	bl 0x00c30130
00bd5220	add x0,x29,#0x1c
00bd5224	mov x1,x19
00bd5228	mov w2,#0x1
00bd522c	bl 0x00c44060
00bd5230	ldrb w8,[x29, #0x1c]
00bd5234	cmp w8,#0x1
00bd5238	b.ne 0x00bd5278
00bd523c	ldr x8,[x19]
00bd5240	ldur x8,[x8, #-0x18]
00bd5244	add x8,x19,x8
00bd5248	ldr x0,[x8, #0x28]
00bd524c	cbz x0,0x00bd529c
00bd5250	ldp x9,x8,[x0, #0x10]
00bd5254	cmp x9,x8
00bd5258	b.eq 0x00bd5280
00bd525c	ldr w9,[x8, #-0x4]!
00bd5260	cmp w21,w9
00bd5264	b.ne 0x00bd5280
00bd5268	str x8,[x0, #0x18]
00bd526c	cmn w21,#0x1
00bd5270	b.ne 0x00bd52a0
00bd5274	b 0x00bd529c
00bd5278	orr w20,w20,#0x4
00bd527c	b 0x00bd52a0
00bd5280	ldr x8,[x0]
00bd5284	ldr x8,[x8, #0x58]
00bd5288	mov w1,w21
00bd528c	blr x8
00bd5290	mov w21,w0
00bd5294	cmn w21,#0x1
00bd5298	b.ne 0x00bd52a0
00bd529c	orr w20,w20,#0x1
00bd52a0	ldr x8,[x19]
00bd52a4	ldur x8,[x8, #-0x18]
00bd52a8	add x0,x19,x8
00bd52ac	ldr w8,[x0, #0x20]
00bd52b0	orr w1,w8,w20
00bd52b4	bl 0x00c30130
00bd52b8	mov x0,x19
00bd52bc	ldp x20,x19,[sp, #0x20]
00bd52c0	ldr x21,[sp, #0x10]
00bd52c4	ldp x29,x30,[sp], #0x30
00bd52c8	autiasp
00bd52cc	ret
