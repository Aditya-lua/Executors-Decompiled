; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::read @ 00bd4f88
00bd4f88	paciasp
00bd4f8c	stp x29,x30,[sp, #-0x30]!
00bd4f90	str x21,[sp, #0x10]
00bd4f94	stp x20,x19,[sp, #0x20]
00bd4f98	mov x29,sp
00bd4f9c	mov x19,x0
00bd4fa0	mov x20,x2
00bd4fa4	mov x21,x1
00bd4fa8	str xzr,[x0, #0x8]
00bd4fac	add x0,x29,#0x1c
00bd4fb0	mov x1,x19
00bd4fb4	mov w2,#0x1
00bd4fb8	bl 0x00c44060
00bd4fbc	ldrb w8,[x29, #0x1c]
00bd4fc0	cmp w8,#0x1
00bd4fc4	b.ne 0x00bd5000
00bd4fc8	ldr x8,[x19]
00bd4fcc	ldur x8,[x8, #-0x18]
00bd4fd0	add x8,x19,x8
00bd4fd4	ldr x0,[x8, #0x28]
00bd4fd8	ldr x8,[x0]
00bd4fdc	ldr x8,[x8, #0x40]
00bd4fe0	mov x1,x21
00bd4fe4	mov x2,x20
00bd4fe8	blr x8
00bd4fec	cmp x0,x20
00bd4ff0	mov w8,#0x6
00bd4ff4	str x0,[x19, #0x8]
00bd4ff8	csel w8,wzr,w8,eq
00bd4ffc	b 0x00bd5004
00bd5000	mov w8,#0x4
00bd5004	ldr x9,[x19]
00bd5008	ldur x9,[x9, #-0x18]
00bd500c	add x0,x19,x9
00bd5010	ldr w9,[x0, #0x20]
00bd5014	orr w1,w9,w8
00bd5018	bl 0x00c30130
00bd501c	mov x0,x19
00bd5020	ldp x20,x19,[sp, #0x20]
00bd5024	ldr x21,[sp, #0x10]
00bd5028	ldp x29,x30,[sp], #0x30
00bd502c	autiasp
00bd5030	ret
