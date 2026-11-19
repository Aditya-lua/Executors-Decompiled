; std::__ndk1::recursive_timed_mutex::unlock @ 00bcd190
00bcd190	paciasp
00bcd194	stp x29,x30,[sp, #-0x20]!
00bcd198	str x19,[sp, #0x10]
00bcd19c	mov x29,sp
00bcd1a0	mov x19,x0
00bcd1a4	bl 0x00c31ca0
00bcd1a8	cbnz w0,0x00bcd1f4
00bcd1ac	ldr x8,[x19, #0x58]
00bcd1b0	subs x8,x8,#0x1
00bcd1b4	str x8,[x19, #0x58]
00bcd1b8	b.eq 0x00bcd1d4
00bcd1bc	mov x0,x19
00bcd1c0	bl 0x00c31cb0
00bcd1c4	ldr x19,[sp, #0x10]
00bcd1c8	ldp x29,x30,[sp], #0x20
00bcd1cc	autiasp
00bcd1d0	ret
00bcd1d4	str xzr,[x19, #0x60]
00bcd1d8	mov x0,x19
00bcd1dc	bl 0x00c31cb0
00bcd1e0	add x0,x19,#0x28
00bcd1e4	ldr x19,[sp, #0x10]
00bcd1e8	ldp x29,x30,[sp], #0x20
00bcd1ec	autiasp
00bcd1f0	b 0x00c315f0
00bcd1f4	adrp x1,0x2be000
00bcd1f8	add x1,x1,#0xc42
00bcd1fc	bl 0x00c2ffc0
