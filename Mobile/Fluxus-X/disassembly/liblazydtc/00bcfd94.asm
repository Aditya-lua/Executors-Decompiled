; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::get @ 00bcfd94
00bcfd94	paciasp
00bcfd98	sub sp,sp,#0x30
00bcfd9c	stp x29,x30,[sp, #0x10]
00bcfda0	stp x20,x19,[sp, #0x20]
00bcfda4	add x29,sp,#0x10
00bcfda8	mov x19,x0
00bcfdac	str xzr,[x0, #0x8]
00bcfdb0	sub x0,x29,#0x4
00bcfdb4	mov x1,x19
00bcfdb8	mov w2,#0x1
00bcfdbc	bl 0x00c30140
00bcfdc0	ldurb w8,[x29, #-0x4]
00bcfdc4	cmp w8,#0x1
00bcfdc8	b.ne 0x00bcfdf8
00bcfdcc	ldr x8,[x19]
00bcfdd0	ldur x8,[x8, #-0x18]
00bcfdd4	add x8,x19,x8
00bcfdd8	ldr x0,[x8, #0x28]
00bcfddc	ldp x8,x9,[x0, #0x18]
00bcfde0	cmp x8,x9
00bcfde4	b.eq 0x00bcfe00
00bcfde8	add x9,x8,#0x1
00bcfdec	str x9,[x0, #0x18]
00bcfdf0	ldrb w20,[x8]
00bcfdf4	b 0x00bcfe18
00bcfdf8	mov w20,#0xffffffff
00bcfdfc	b 0x00bcfe3c
00bcfe00	ldr x8,[x0]
00bcfe04	ldr x8,[x8, #0x50]
00bcfe08	blr x8
00bcfe0c	mov w20,w0
00bcfe10	cmn w0,#0x1
00bcfe14	b.eq 0x00bcfe54
00bcfe18	mov w9,#0x1
00bcfe1c	mov w8,wzr
00bcfe20	str x9,[x19, #0x8]
00bcfe24	ldr x9,[x19]
00bcfe28	ldur x9,[x9, #-0x18]
00bcfe2c	add x0,x19,x9
00bcfe30	ldr w9,[x0, #0x20]
00bcfe34	orr w1,w9,w8
00bcfe38	bl 0x00c30130
00bcfe3c	mov w0,w20
00bcfe40	ldp x20,x19,[sp, #0x20]
00bcfe44	ldp x29,x30,[sp, #0x10]
00bcfe48	add sp,sp,#0x30
00bcfe4c	autiasp
00bcfe50	ret
00bcfe54	mov w8,#0x6
00bcfe58	b 0x00bcfe24
