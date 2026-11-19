; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::sentry @ 00bd2e78
00bd2e78	paciasp
00bd2e7c	sub sp,sp,#0x40
00bd2e80	stp x29,x30,[sp, #0x10]
00bd2e84	stp x22,x21,[sp, #0x20]
00bd2e88	stp x20,x19,[sp, #0x30]
00bd2e8c	add x29,sp,#0x10
00bd2e90	ldr x8,[x1]
00bd2e94	strb wzr,[x0]
00bd2e98	mov x19,x0
00bd2e9c	ldur x9,[x8, #-0x18]
00bd2ea0	add x0,x1,x9
00bd2ea4	ldr w9,[x0, #0x20]
00bd2ea8	cbz w9,0x00bd2ec8
00bd2eac	orr w1,w9,#0x4
00bd2eb0	ldp x20,x19,[sp, #0x30]
00bd2eb4	ldp x22,x21,[sp, #0x20]
00bd2eb8	ldp x29,x30,[sp, #0x10]
00bd2ebc	add sp,sp,#0x40
00bd2ec0	autiasp
00bd2ec4	b 0x00c30130
00bd2ec8	ldr x0,[x0, #0x88]
00bd2ecc	mov x20,x1
00bd2ed0	cbz x0,0x00bd2ee4
00bd2ed4	mov w21,w2
00bd2ed8	bl 0x00c44030
00bd2edc	ldr x8,[x20]
00bd2ee0	mov w2,w21
00bd2ee4	tbnz w2,#0x0,0x00bd2f4c
00bd2ee8	ldur x9,[x8, #-0x18]
00bd2eec	add x0,x20,x9
00bd2ef0	ldrb w9,[x0, #0x9]
00bd2ef4	tbz w9,#0x4,0x00bd2f4c
00bd2ef8	add x8,sp,#0x8
00bd2efc	bl 0x00c30070
00bd2f00	adrp x1,0xcb5000
00bd2f04	add x0,sp,#0x8
00bd2f08	ldr x1,[x1, #0xb98]
00bd2f0c	bl 0x00c30080
00bd2f10	mov x21,x0
00bd2f14	add x0,sp,#0x8
00bd2f18	bl 0x00c30090
00bd2f1c	ldr x8,[x20]
00bd2f20	ldur x8,[x8, #-0x18]
00bd2f24	add x8,x20,x8
00bd2f28	ldr x22,[x8, #0x28]
00bd2f2c	cbnz x22,0x00bd2f8c
00bd2f30	ldr x8,[x20]
00bd2f34	ldur x8,[x8, #-0x18]
00bd2f38	add x0,x20,x8
00bd2f3c	ldr w8,[x0, #0x20]
00bd2f40	orr w1,w8,#0x6
00bd2f44	bl 0x00c30130
00bd2f48	ldr x8,[x20]
00bd2f4c	ldur x8,[x8, #-0x18]
00bd2f50	add x8,x20,x8
00bd2f54	ldr w8,[x8, #0x20]
00bd2f58	cmp w8,#0x0
00bd2f5c	cset w8,eq
00bd2f60	strb w8,[x19]
00bd2f64	ldp x20,x19,[sp, #0x30]
00bd2f68	ldp x22,x21,[sp, #0x20]
00bd2f6c	ldp x29,x30,[sp, #0x10]
00bd2f70	add sp,sp,#0x40
00bd2f74	autiasp
00bd2f78	ret
00bd2f7c	ldr x8,[x22]
00bd2f80	mov x0,x22
00bd2f84	ldr x8,[x8, #0x50]
00bd2f88	blr x8
00bd2f8c	ldp x8,x9,[x22, #0x18]
00bd2f90	cmp x8,x9
00bd2f94	b.eq 0x00bd2fa8
00bd2f98	ldr w0,[x8]
00bd2f9c	cmn w0,#0x1
00bd2fa0	b.ne 0x00bd2fc0
00bd2fa4	b 0x00bd2f30
00bd2fa8	ldr x8,[x22]
00bd2fac	mov x0,x22
00bd2fb0	ldr x8,[x8, #0x48]
00bd2fb4	blr x8
00bd2fb8	cmn w0,#0x1
00bd2fbc	b.eq 0x00bd2f30
00bd2fc0	ldp x8,x9,[x22, #0x18]
00bd2fc4	cmp x8,x9
00bd2fc8	b.eq 0x00bd2fd4
00bd2fcc	ldr w2,[x8]
00bd2fd0	b 0x00bd2fe8
00bd2fd4	ldr x8,[x22]
00bd2fd8	mov x0,x22
00bd2fdc	ldr x8,[x8, #0x48]
00bd2fe0	blr x8
00bd2fe4	mov w2,w0
00bd2fe8	ldr x8,[x21]
00bd2fec	mov x0,x21
00bd2ff0	mov w1,#0x1
00bd2ff4	ldr x8,[x8, #0x18]
00bd2ff8	blr x8
00bd2ffc	tbz w0,#0x0,0x00bd3018
00bd3000	ldp x8,x9,[x22, #0x18]
00bd3004	cmp x8,x9
00bd3008	b.eq 0x00bd2f7c
00bd300c	add x8,x8,#0x4
00bd3010	str x8,[x22, #0x18]
00bd3014	b 0x00bd2f8c
00bd3018	ldp x8,x9,[x22, #0x18]
00bd301c	cmp x8,x9
00bd3020	b.eq 0x00bd302c
00bd3024	ldr w0,[x8]
00bd3028	b 0x00bd303c
00bd302c	ldr x8,[x22]
00bd3030	mov x0,x22
00bd3034	ldr x8,[x8, #0x48]
00bd3038	blr x8
00bd303c	ldr x8,[x20]
00bd3040	cmn w0,#0x1
00bd3044	b.ne 0x00bd2f4c
00bd3048	b 0x00bd2f34
