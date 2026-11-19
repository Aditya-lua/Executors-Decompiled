; FUN_00891e8c @ 00891e8c
00891e8c	stp x29,x30,[sp, #-0x20]!
00891e90	stp x20,x19,[sp, #0x10]
00891e94	mov x29,sp
00891e98	mov x19,x0
00891e9c	ldr x0,[x0, #0x28]
00891ea0	cbz x0,0x00891eb8
00891ea4	ldr x20,[x0]
00891ea8	mov w1,#0x20
00891eac	bl 0x00c2fe80
00891eb0	mov x0,x20
00891eb4	cbnz x20,0x00891ea4
00891eb8	ldr x0,[x19, #0x18]
00891ebc	str xzr,[x19, #0x18]
00891ec0	cbz x0,0x00891ed0
00891ec4	ldr x8,[x19, #0x20]
00891ec8	lsl x1,x8,#0x3
00891ecc	bl 0x00c2fe80
00891ed0	ldr x0,[x19]
00891ed4	cbz x0,0x00891ef0
00891ed8	ldr x8,[x19, #0x10]
00891edc	str x0,[x19, #0x8]
00891ee0	sub x1,x8,x0
00891ee4	ldp x20,x19,[sp, #0x10]
00891ee8	ldp x29,x30,[sp], #0x20
00891eec	b 0x00c2fe80
00891ef0	ldp x20,x19,[sp, #0x10]
00891ef4	ldp x29,x30,[sp], #0x20
00891ef8	ret
