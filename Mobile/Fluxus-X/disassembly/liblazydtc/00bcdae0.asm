; std::__ndk1::ios_base::__call_callbacks @ 00bcdae0
00bcdae0	bti c
00bcdae4	ldr x8,[x0, #0x48]
00bcdae8	cbz x8,0x00bcdb40
00bcdaec	paciasp
00bcdaf0	stp x29,x30,[sp, #-0x30]!
00bcdaf4	str x21,[sp, #0x10]
00bcdaf8	stp x20,x19,[sp, #0x20]
00bcdafc	mov x29,sp
00bcdb00	mov x19,x0
00bcdb04	mov w20,w1
00bcdb08	sub x21,x8,#0x1
00bcdb0c	ldp x8,x9,[x19, #0x38]
00bcdb10	mov w0,w20
00bcdb14	mov x1,x19
00bcdb18	ldr x8,[x8, x21, LSL #0x3]
00bcdb1c	ldr w2,[x9, x21, LSL #0x2]
00bcdb20	blr x8
00bcdb24	sub x21,x21,#0x1
00bcdb28	cmn x21,#0x1
00bcdb2c	b.ne 0x00bcdb0c
00bcdb30	ldp x20,x19,[sp, #0x20]
00bcdb34	ldr x21,[sp, #0x10]
00bcdb38	ldp x29,x30,[sp], #0x30
00bcdb3c	autiasp
00bcdb40	ret
