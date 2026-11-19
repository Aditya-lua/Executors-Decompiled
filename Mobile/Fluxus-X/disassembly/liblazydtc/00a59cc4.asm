; EVP_EncodeFinal @ 00a59cc4
00a59cc4	str x21,[sp, #-0x30]!
00a59cc8	stp x20,x19,[sp, #0x10]
00a59ccc	stp x29,x30,[sp, #0x20]
00a59cd0	ldr w3,[x0]
00a59cd4	mov x19,x2
00a59cd8	add x29,sp,#0x20
00a59cdc	cbz w3,0x00a59d14
00a59ce0	add x2,x0,#0x8
00a59ce4	mov x20,x0
00a59ce8	mov x21,x1
00a59cec	bl 0x00a59bb8
00a59cf0	ldrb w8,[x20, #0x5c]
00a59cf4	tbnz w8,#0x0,0x00a59d08
00a59cf8	add w8,w0,#0x1
00a59cfc	mov w9,#0xa
00a59d00	strb w9,[x21, w0, UXTW ]
00a59d04	mov w0,w8
00a59d08	strb wzr,[x21, w0, UXTW ]
00a59d0c	str wzr,[x20]
00a59d10	b 0x00a59d18
00a59d14	mov w0,wzr
00a59d18	str w0,[x19]
00a59d1c	ldp x29,x30,[sp, #0x20]
00a59d20	ldp x20,x19,[sp, #0x10]
00a59d24	ldr x21,[sp], #0x30
00a59d28	ret
