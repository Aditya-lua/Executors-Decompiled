; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::peek @ 00bd4e84
00bd4e84	paciasp
00bd4e88	sub sp,sp,#0x30
00bd4e8c	stp x29,x30,[sp, #0x10]
00bd4e90	stp x20,x19,[sp, #0x20]
00bd4e94	add x29,sp,#0x10
00bd4e98	mov x19,x0
00bd4e9c	str xzr,[x0, #0x8]
00bd4ea0	sub x0,x29,#0x4
00bd4ea4	mov x1,x19
00bd4ea8	mov w2,#0x1
00bd4eac	bl 0x00c44060
00bd4eb0	ldurb w8,[x29, #-0x4]
00bd4eb4	cmp w8,#0x1
00bd4eb8	b.ne 0x00bd4ee0
00bd4ebc	ldr x8,[x19]
00bd4ec0	ldur x8,[x8, #-0x18]
00bd4ec4	add x8,x19,x8
00bd4ec8	ldr x0,[x8, #0x28]
00bd4ecc	ldp x8,x9,[x0, #0x18]
00bd4ed0	cmp x8,x9
00bd4ed4	b.eq 0x00bd4ee8
00bd4ed8	ldr w20,[x8]
00bd4edc	b 0x00bd4ef8
00bd4ee0	mov w20,#0xffffffff
00bd4ee4	b 0x00bd4f1c
00bd4ee8	ldr x8,[x0]
00bd4eec	ldr x8,[x8, #0x48]
00bd4ef0	blr x8
00bd4ef4	mov w20,w0
00bd4ef8	cmn w20,#0x1
00bd4efc	cset w8,eq
00bd4f00	lsl w8,w8,#0x1
00bd4f04	ldr x9,[x19]
00bd4f08	ldur x9,[x9, #-0x18]
00bd4f0c	add x0,x19,x9
00bd4f10	ldr w9,[x0, #0x20]
00bd4f14	orr w1,w9,w8
00bd4f18	bl 0x00c30130
00bd4f1c	mov w0,w20
00bd4f20	ldp x20,x19,[sp, #0x20]
00bd4f24	ldp x29,x30,[sp, #0x10]
00bd4f28	add sp,sp,#0x30
00bd4f2c	autiasp
00bd4f30	ret
