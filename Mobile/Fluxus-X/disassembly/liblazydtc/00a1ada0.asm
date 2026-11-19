; BN_generate_prime_ex @ 00a1ada0
00a1ada0	str x25,[sp, #-0x50]!
00a1ada4	stp x24,x23,[sp, #0x10]
00a1ada8	stp x22,x21,[sp, #0x20]
00a1adac	stp x20,x19,[sp, #0x30]
00a1adb0	stp x29,x30,[sp, #0x40]
00a1adb4	add x29,sp,#0x40
00a1adb8	mov x19,x5
00a1adbc	mov x20,x4
00a1adc0	mov x22,x3
00a1adc4	mov w23,w2
00a1adc8	mov w24,w1
00a1adcc	mov x25,x0
00a1add0	bl 0x00c38a50
00a1add4	cbz x0,0x00a1ae0c
00a1add8	mov x21,x0
00a1addc	mov x0,x25
00a1ade0	mov w1,w24
00a1ade4	mov w2,w23
00a1ade8	mov x3,x22
00a1adec	mov x4,x20
00a1adf0	mov x5,x19
00a1adf4	mov x6,x21
00a1adf8	bl 0x00a1a4f0
00a1adfc	mov w19,w0
00a1ae00	mov x0,x21
00a1ae04	bl 0x00c38a30
00a1ae08	mov w0,w19
00a1ae0c	ldp x29,x30,[sp, #0x40]
00a1ae10	ldp x20,x19,[sp, #0x30]
00a1ae14	ldp x22,x21,[sp, #0x20]
00a1ae18	ldp x24,x23,[sp, #0x10]
00a1ae1c	ldr x25,[sp], #0x50
00a1ae20	ret
