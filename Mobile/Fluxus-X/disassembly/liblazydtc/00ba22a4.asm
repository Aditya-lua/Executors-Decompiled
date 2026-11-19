; psa_is_key_present_in_storage @ 00ba22a4
00ba22a4	sub sp,sp,#0x30
00ba22a8	str x19,[sp, #0x10]
00ba22ac	stp x29,x30,[sp, #0x20]
00ba22b0	add x29,sp,#0x20
00ba22b4	mrs x19,tpidr_el0
00ba22b8	ldr x8,[x19, #0x28]
00ba22bc	mov w0,w0
00ba22c0	mov x1,sp
00ba22c4	str x8,[sp, #0x8]
00ba22c8	bl 0x00c43270
00ba22cc	ldr x8,[x19, #0x28]
00ba22d0	ldr x9,[sp, #0x8]
00ba22d4	cmn w0,#0x8c
00ba22d8	cset w0,ne
00ba22dc	cmp x8,x9
00ba22e0	b.ne 0x00ba22f4
00ba22e4	ldp x29,x30,[sp, #0x20]
00ba22e8	ldr x19,[sp, #0x10]
00ba22ec	add sp,sp,#0x30
00ba22f0	ret
00ba22f4	bl 0x00c2fec0
