; std::__ndk1::num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::do_put @ 00be518c
00be518c	paciasp
00be5190	sub sp,sp,#0xb0
00be5194	stp x29,x30,[sp, #0x60]
00be5198	stp x26,x25,[sp, #0x70]
00be519c	stp x24,x23,[sp, #0x80]
00be51a0	stp x22,x21,[sp, #0x90]
00be51a4	stp x20,x19,[sp, #0xa0]
00be51a8	add x29,sp,#0x60
00be51ac	adrp x8,0xd27000
00be51b0	add x8,x8,#0xf8
00be51b4	mov x22,x4
00be51b8	ldarb w8,[x8]
00be51bc	mov w19,w3
00be51c0	mov x20,x2
00be51c4	mov x21,x1
00be51c8	adrp x23,0xd27000
00be51cc	tbz w8,#0x0,0x00be534c
00be51d0	ldr x2,[x23, #0xf0]
00be51d4	adrp x3,0x2ab000
00be51d8	add x3,x3,#0x219
00be51dc	sub x0,x29,#0x2c
00be51e0	mov w1,#0x14
00be51e4	mov x4,x22
00be51e8	sub x22,x29,#0x2c
00be51ec	bl 0x00c0cd14
00be51f0	ldr w8,[x20, #0x8]
00be51f4	sxtw x24,w0
00be51f8	mov w9,#0xb0
00be51fc	and w8,w8,w9
00be5200	add x22,x22,x24
00be5204	cmp w8,#0x20
00be5208	mov x25,x22
00be520c	b.eq 0x00be5268
00be5210	cmp w8,#0x10
00be5214	b.ne 0x00be5264
00be5218	ldurb w8,[x29, #-0x2c]
00be521c	cmp w8,#0x2d
00be5220	b.eq 0x00be522c
00be5224	cmp w8,#0x2b
00be5228	b.ne 0x00be5238
00be522c	sub x8,x29,#0x2c
00be5230	orr x25,x8,#0x1
00be5234	b 0x00be5268
00be5238	cmp w24,#0x2
00be523c	b.lt 0x00be5264
00be5240	cmp w8,#0x30
00be5244	b.ne 0x00be5264
00be5248	ldurb w8,[x29, #-0x2b]
00be524c	orr w8,w8,#0x20
00be5250	cmp w8,#0x78
00be5254	b.ne 0x00be5264
00be5258	sub x8,x29,#0x2c
00be525c	orr x25,x8,#0x2
00be5260	b 0x00be5268
00be5264	sub x25,x29,#0x2c
00be5268	mov x8,sp
00be526c	mov x0,x20
00be5270	bl 0x00c30070
00be5274	adrp x26,0xcb4000
00be5278	ldr x26,[x26, #0x998]
00be527c	ldr x23,[sp]
00be5280	stur x26,[x29, #-0x18]
00be5284	ldar x8,[x26]
00be5288	cmn x8,#0x1
00be528c	b.eq 0x00be52b4
00be5290	sub x8,x29,#0x18
00be5294	sub x9,x29,#0x8
00be5298	stp x9,x8,[x29, #-0x10]
00be529c	adrp x0,0xcb4000
00be52a0	nop
00be52a4	adr x2,0xc0bab0
00be52a8	ldr x0,[x0, #0x998]
00be52ac	sub x1,x29,#0x10
00be52b0	bl 0x00c305d0
00be52b4	ldp x8,x10,[x23, #0x10]
00be52b8	ldrsw x9,[x26, #0x8]
00be52bc	sub x9,x9,#0x1
00be52c0	sub x10,x10,x8
00be52c4	cmp x9,x10, ASR #0x3
00be52c8	b.cs 0x00be5348
00be52cc	ldr x23,[x8, x9, LSL #0x3]
00be52d0	cbz x23,0x00be5348
00be52d4	mov x0,sp
00be52d8	bl 0x00c30090
00be52dc	ldr x8,[x23]
00be52e0	sub x1,x29,#0x2c
00be52e4	add x3,sp,#0xf
00be52e8	mov x0,x23
00be52ec	mov x2,x22
00be52f0	sub x23,x29,#0x2c
00be52f4	ldr x8,[x8, #0x40]
00be52f8	add x26,sp,#0xf
00be52fc	blr x8
00be5300	sub x8,x25,x23
00be5304	add x3,x26,x24
00be5308	cmp x25,x22
00be530c	add x8,x26,x8
00be5310	add x1,sp,#0xf
00be5314	mov x0,x21
00be5318	csel x2,x3,x8,eq
00be531c	mov x4,x20
00be5320	mov w5,w19
00be5324	bl 0x00be5420
00be5328	ldp x20,x19,[sp, #0xa0]
00be532c	ldp x22,x21,[sp, #0x90]
00be5330	ldp x24,x23,[sp, #0x80]
00be5334	ldp x26,x25,[sp, #0x70]
00be5338	ldp x29,x30,[sp, #0x60]
00be533c	add sp,sp,#0xb0
00be5340	autiasp
00be5344	ret
00be5348	bl 0x00bd8968
00be534c	adrp x0,0xd27000
00be5350	add x0,x0,#0xf8
00be5354	bl 0x00c2fe90
00be5358	cbz w0,0x00be51d0
00be535c	adrp x1,0x2c6000
00be5360	add x1,x1,#0xbfc
00be5364	mov w0,#0x1fbf
00be5368	mov x2,xzr
00be536c	bl 0x00c43890
00be5370	str x0,[x23, #0xf0]
00be5374	adrp x0,0xd27000
00be5378	add x0,x0,#0xf8
00be537c	bl 0x00c2fea0
00be5380	b 0x00be51d0
