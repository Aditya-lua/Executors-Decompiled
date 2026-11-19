; std::__ndk1::time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::__get_white_space @ 00beba50
00beba50	paciasp
00beba54	stp x29,x30,[sp, #-0x40]!
00beba58	str x23,[sp, #0x10]
00beba5c	stp x22,x21,[sp, #0x20]
00beba60	stp x20,x19,[sp, #0x30]
00beba64	mov x29,sp
00beba68	mov x22,x4
00beba6c	mov x19,x3
00beba70	mov x20,x2
00beba74	mov x21,x1
00beba78	ldr x0,[x21]
00beba7c	cbnz x0,0x00beba94
00beba80	b 0x00bebae0
00beba84	add x8,x8,#0x4
00beba88	str x8,[x0, #0x18]
00beba8c	ldr x0,[x21]
00beba90	cbz x0,0x00bebae0
00beba94	ldp x8,x9,[x0, #0x18]
00beba98	cmp x8,x9
00beba9c	b.eq 0x00bebac4
00bebaa0	ldr w0,[x8]
00bebaa4	cmn w0,#0x1
00bebaa8	b.eq 0x00bebad8
00bebaac	ldr x0,[x21]
00bebab0	cmp x0,#0x0
00bebab4	cset w23,eq
00bebab8	cbnz x20,0x00bebae8
00bebabc	tbz w23,#0x0,0x00bebb2c
00bebac0	b 0x00bebb94
00bebac4	ldr x8,[x0]
00bebac8	ldr x8,[x8, #0x48]
00bebacc	blr x8
00bebad0	cmn w0,#0x1
00bebad4	b.ne 0x00bebaac
00bebad8	mov x0,xzr
00bebadc	str xzr,[x21]
00bebae0	mov w23,#0x1
00bebae4	cbz x20,0x00bebabc
00bebae8	ldp x8,x9,[x20, #0x18]
00bebaec	cmp x8,x9
00bebaf0	b.eq 0x00bebafc
00bebaf4	ldr w8,[x8]
00bebaf8	b 0x00bebb18
00bebafc	ldr x8,[x20]
00bebb00	mov x0,x20
00bebb04	ldr x8,[x8, #0x48]
00bebb08	blr x8
00bebb0c	ldr x9,[x21]
00bebb10	mov w8,w0
00bebb14	mov x0,x9
00bebb18	cmn w8,#0x1
00bebb1c	cset w8,eq
00bebb20	csel x20,xzr,x20,eq
00bebb24	cmp w23,w8
00bebb28	b.eq 0x00bebb94
00bebb2c	ldp x8,x9,[x0, #0x18]
00bebb30	cmp x8,x9
00bebb34	b.eq 0x00bebb40
00bebb38	ldr w2,[x8]
00bebb3c	b 0x00bebb50
00bebb40	ldr x8,[x0]
00bebb44	ldr x8,[x8, #0x48]
00bebb48	blr x8
00bebb4c	mov w2,w0
00bebb50	ldr x8,[x22]
00bebb54	mov x0,x22
00bebb58	mov w1,#0x1
00bebb5c	ldr x8,[x8, #0x18]
00bebb60	blr x8
00bebb64	mov w8,w0
00bebb68	ldr x0,[x21]
00bebb6c	tbz w8,#0x0,0x00bebb94
00bebb70	ldp x8,x9,[x0, #0x18]
00bebb74	cmp x8,x9
00bebb78	b.ne 0x00beba84
00bebb7c	ldr x8,[x0]
00bebb80	ldr x8,[x8, #0x50]
00bebb84	blr x8
00bebb88	ldr x0,[x21]
00bebb8c	cbnz x0,0x00beba94
00bebb90	b 0x00bebae0
00bebb94	cbz x0,0x00bebbe0
00bebb98	ldp x8,x9,[x0, #0x18]
00bebb9c	cmp x8,x9
00bebba0	b.eq 0x00bebbc8
00bebba4	ldr w0,[x8]
00bebba8	cmn w0,#0x1
00bebbac	b.eq 0x00bebbdc
00bebbb0	ldr x8,[x21]
00bebbb4	cmp x8,#0x0
00bebbb8	cset w21,eq
00bebbbc	cbnz x20,0x00bebbe8
00bebbc0	tbnz w21,#0x0,0x00bebc1c
00bebbc4	b 0x00bebc28
00bebbc8	ldr x8,[x0]
00bebbcc	ldr x8,[x8, #0x48]
00bebbd0	blr x8
00bebbd4	cmn w0,#0x1
00bebbd8	b.ne 0x00bebbb0
00bebbdc	str xzr,[x21]
00bebbe0	mov w21,#0x1
00bebbe4	cbz x20,0x00bebbc0
00bebbe8	ldp x8,x9,[x20, #0x18]
00bebbec	cmp x8,x9
00bebbf0	b.eq 0x00bebbfc
00bebbf4	ldr w0,[x8]
00bebbf8	b 0x00bebc0c
00bebbfc	ldr x8,[x20]
00bebc00	mov x0,x20
00bebc04	ldr x8,[x8, #0x48]
00bebc08	blr x8
00bebc0c	cmn w0,#0x1
00bebc10	cset w8,eq
00bebc14	eor w8,w21,w8
00bebc18	tbnz w8,#0x0,0x00bebc28
00bebc1c	ldr w8,[x19]
00bebc20	orr w8,w8,#0x2
00bebc24	str w8,[x19]
00bebc28	ldp x20,x19,[sp, #0x30]
00bebc2c	ldr x23,[sp, #0x10]
00bebc30	ldp x22,x21,[sp, #0x20]
00bebc34	ldp x29,x30,[sp], #0x40
00bebc38	autiasp
00bebc3c	ret
