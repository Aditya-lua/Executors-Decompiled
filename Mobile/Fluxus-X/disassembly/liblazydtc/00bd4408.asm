; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::get @ 00bd4408
00bd4408	paciasp
00bd440c	sub sp,sp,#0x30
00bd4410	stp x29,x30,[sp, #0x10]
00bd4414	stp x20,x19,[sp, #0x20]
00bd4418	add x29,sp,#0x10
00bd441c	mov x19,x0
00bd4420	str xzr,[x0, #0x8]
00bd4424	sub x0,x29,#0x4
00bd4428	mov x1,x19
00bd442c	mov w2,#0x1
00bd4430	bl 0x00c44060
00bd4434	ldurb w8,[x29, #-0x4]
00bd4438	cmp w8,#0x1
00bd443c	b.ne 0x00bd447c
00bd4440	ldr x8,[x19]
00bd4444	ldur x8,[x8, #-0x18]
00bd4448	add x8,x19,x8
00bd444c	ldr x0,[x8, #0x28]
00bd4450	ldp x8,x9,[x0, #0x18]
00bd4454	cmp x8,x9
00bd4458	b.eq 0x00bd4484
00bd445c	ldr w20,[x8], #0x4
00bd4460	str x8,[x0, #0x18]
00bd4464	cmn w20,#0x1
00bd4468	b.eq 0x00bd449c
00bd446c	mov w9,#0x1
00bd4470	mov w8,wzr
00bd4474	str x9,[x19, #0x8]
00bd4478	b 0x00bd44a0
00bd447c	mov w20,#0xffffffff
00bd4480	b 0x00bd44b8
00bd4484	ldr x8,[x0]
00bd4488	ldr x8,[x8, #0x50]
00bd448c	blr x8
00bd4490	mov w20,w0
00bd4494	cmn w20,#0x1
00bd4498	b.ne 0x00bd446c
00bd449c	mov w8,#0x6
00bd44a0	ldr x9,[x19]
00bd44a4	ldur x9,[x9, #-0x18]
00bd44a8	add x0,x19,x9
00bd44ac	ldr w9,[x0, #0x20]
00bd44b0	orr w1,w9,w8
00bd44b4	bl 0x00c30130
00bd44b8	mov w0,w20
00bd44bc	ldp x20,x19,[sp, #0x20]
00bd44c0	ldp x29,x30,[sp, #0x10]
00bd44c4	add sp,sp,#0x30
00bd44c8	autiasp
00bd44cc	ret
