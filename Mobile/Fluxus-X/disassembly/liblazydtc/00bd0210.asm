; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::get @ 00bd0210
00bd0210	paciasp
00bd0214	stp x29,x30,[sp, #-0x40]!
00bd0218	str x23,[sp, #0x10]
00bd021c	stp x22,x21,[sp, #0x20]
00bd0220	stp x20,x19,[sp, #0x30]
00bd0224	mov x29,sp
00bd0228	mov x19,x0
00bd022c	mov w21,w2
00bd0230	mov x20,x1
00bd0234	str xzr,[x0, #0x8]
00bd0238	add x0,x29,#0x1c
00bd023c	mov x1,x19
00bd0240	mov w2,#0x1
00bd0244	bl 0x00c30140
00bd0248	ldrb w8,[x29, #0x1c]
00bd024c	cmp w8,#0x1
00bd0250	b.ne 0x00bd0354
00bd0254	and w21,w21,#0xff
00bd0258	add x22,x19,#0x28
00bd025c	mov x23,#0x7fffffffffffffff
00bd0260	b 0x00bd0284
00bd0264	ldr x8,[x19]
00bd0268	ldur x8,[x8, #-0x18]
00bd026c	ldr x0,[x22, x8#0x0]
00bd0270	ldp x8,x9,[x0, #0x18]
00bd0274	cmp x8,x9
00bd0278	b.eq 0x00bd0314
00bd027c	add x8,x8,#0x1
00bd0280	str x8,[x0, #0x18]
00bd0284	ldr x8,[x19]
00bd0288	ldur x8,[x8, #-0x18]
00bd028c	ldr x0,[x22, x8#0x0]
00bd0290	ldp x8,x9,[x0, #0x18]
00bd0294	cmp x8,x9
00bd0298	b.eq 0x00bd02a4
00bd029c	ldrb w0,[x8]
00bd02a0	b 0x00bd02b8
00bd02a4	ldr x8,[x0]
00bd02a8	ldr x8,[x8, #0x48]
00bd02ac	blr x8
00bd02b0	cmn w0,#0x1
00bd02b4	b.eq 0x00bd032c
00bd02b8	and w8,w0,#0xff
00bd02bc	cmp w21,w8
00bd02c0	b.eq 0x00bd0324
00bd02c4	ldp x9,x10,[x20, #0x30]
00bd02c8	cmp x9,x10
00bd02cc	b.eq 0x00bd02e0
00bd02d0	add x10,x9,#0x1
00bd02d4	str x10,[x20, #0x30]
00bd02d8	strb w8,[x9]
00bd02dc	b 0x00bd02fc
00bd02e0	ldr x8,[x20]
00bd02e4	ldr x8,[x8, #0x68]
00bd02e8	and w1,w0,#0xff
00bd02ec	mov x0,x20
00bd02f0	blr x8
00bd02f4	cmn w0,#0x1
00bd02f8	b.eq 0x00bd0324
00bd02fc	ldr x8,[x19, #0x8]
00bd0300	cmp x8,x23
00bd0304	b.eq 0x00bd0264
00bd0308	add x8,x8,#0x1
00bd030c	str x8,[x19, #0x8]
00bd0310	b 0x00bd0264
00bd0314	ldr x8,[x0]
00bd0318	ldr x8,[x8, #0x50]
00bd031c	blr x8
00bd0320	b 0x00bd0284
00bd0324	mov w8,wzr
00bd0328	b 0x00bd0330
00bd032c	mov w8,#0x2
00bd0330	ldp x9,x10,[x19]
00bd0334	ldur x9,[x9, #-0x18]
00bd0338	cmp x10,#0x0
00bd033c	add x0,x19,x9
00bd0340	orr w9,w8,#0x4
00bd0344	ldr w10,[x0, #0x20]
00bd0348	csel w8,w9,w8,eq
00bd034c	orr w1,w10,w8
00bd0350	bl 0x00c30130
00bd0354	mov x0,x19
00bd0358	ldp x20,x19,[sp, #0x30]
00bd035c	ldr x23,[sp, #0x10]
00bd0360	ldp x22,x21,[sp, #0x20]
00bd0364	ldp x29,x30,[sp], #0x40
00bd0368	autiasp
00bd036c	ret
