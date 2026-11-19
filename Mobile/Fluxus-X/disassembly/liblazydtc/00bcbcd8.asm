; std::__ndk1::condition_variable::wait @ 00bcbcd8
00bcbcd8	paciasp
00bcbcdc	stp x29,x30,[sp, #-0x10]!
00bcbce0	mov x29,sp
00bcbce4	ldrb w8,[x1, #0x8]
00bcbce8	cmp w8,#0x1
00bcbcec	b.ne 0x00bcbd08
00bcbcf0	ldr x1,[x1]
00bcbcf4	bl 0x00c43ad0
00bcbcf8	cbnz w0,0x00bcbd18
00bcbcfc	ldp x29,x30,[sp], #0x10
00bcbd00	autiasp
00bcbd04	ret
00bcbd08	adrp x1,0x2d6000
00bcbd0c	add x1,x1,#0xdcd
00bcbd10	mov w0,#0x1
00bcbd14	b 0x00bcbd20
00bcbd18	adrp x1,0x2b1000
00bcbd1c	add x1,x1,#0xc8
00bcbd20	bl 0x00c2ffc0
