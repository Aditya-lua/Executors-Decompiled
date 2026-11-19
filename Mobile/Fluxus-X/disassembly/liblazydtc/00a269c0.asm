; ossl_ec_pt_format_name2id @ 00a269c0
00a269c0	str x19,[sp, #-0x20]!
00a269c4	stp x29,x30,[sp, #0x10]
00a269c8	add x29,sp,#0x10
00a269cc	cbz x0,0x00a26a14
00a269d0	adrp x1,0x2cd000
00a269d4	add x1,x1,#0x936
00a269d8	mov x19,x0
00a269dc	bl 0x00c35ee0
00a269e0	cbz w0,0x00a26a1c
00a269e4	adrp x1,0x2a3000
00a269e8	add x1,x1,#0xf0c
00a269ec	mov x0,x19
00a269f0	bl 0x00c35ee0
00a269f4	cbz w0,0x00a26a24
00a269f8	adrp x1,0x2a0000
00a269fc	add x1,x1,#0x19
00a26a00	mov x0,x19
00a26a04	bl 0x00c35ee0
00a26a08	cbz w0,0x00a26a2c
00a26a0c	mov w0,#0xffffffff
00a26a10	b 0x00a26a40
00a26a14	mov w0,#0x4
00a26a18	b 0x00a26a40
00a26a1c	mov x8,xzr
00a26a20	b 0x00a26a30
00a26a24	mov w8,#0x1
00a26a28	b 0x00a26a30
00a26a2c	mov w8,#0x2
00a26a30	adrp x9,0xc5b000
00a26a34	lsl x8,x8,#0x4
00a26a38	add x9,x9,#0x408
00a26a3c	ldr w0,[x9, x8#0x0]
00a26a40	ldp x29,x30,[sp, #0x10]
00a26a44	ldr x19,[sp], #0x20
00a26a48	ret
