; SSL_get0_dane_tlsa @ 009b2e7c
009b2e7c	stp x24,x23,[sp, #-0x40]!
009b2e80	stp x22,x21,[sp, #0x10]
009b2e84	stp x20,x19,[sp, #0x20]
009b2e88	stp x29,x30,[sp, #0x30]
009b2e8c	mov x20,x0
009b2e90	ldr x0,[x0, #0x4e8]
009b2e94	add x29,sp,#0x30
009b2e98	mov x19,x5
009b2e9c	mov x21,x4
009b2ea0	mov x22,x3
009b2ea4	mov x23,x2
009b2ea8	mov x24,x1
009b2eac	bl 0x00c325e0
009b2eb0	cmp w0,#0x1
009b2eb4	b.lt 0x009b2ec0
009b2eb8	ldr x8,[x20, #0x9b8]
009b2ebc	cbz x8,0x009b2ec8
009b2ec0	mov w0,#0xffffffff
009b2ec4	b 0x009b2f20
009b2ec8	ldr x8,[x20, #0x4f8]
009b2ecc	cbz x8,0x009b2f1c
009b2ed0	cbz x24,0x009b2edc
009b2ed4	ldrb w8,[x8]
009b2ed8	strb w8,[x24]
009b2edc	cbz x23,0x009b2eec
009b2ee0	ldr x8,[x20, #0x4f8]
009b2ee4	ldrb w8,[x8, #0x1]
009b2ee8	strb w8,[x23]
009b2eec	cbz x22,0x009b2efc
009b2ef0	ldr x8,[x20, #0x4f8]
009b2ef4	ldrb w8,[x8, #0x2]
009b2ef8	strb w8,[x22]
009b2efc	cbz x21,0x009b2f0c
009b2f00	ldr x8,[x20, #0x4f8]
009b2f04	ldr x8,[x8, #0x8]
009b2f08	str x8,[x21]
009b2f0c	cbz x19,0x009b2f1c
009b2f10	ldr x8,[x20, #0x4f8]
009b2f14	ldr x8,[x8, #0x10]
009b2f18	str x8,[x19]
009b2f1c	ldr w0,[x20, #0x50c]
009b2f20	ldp x29,x30,[sp, #0x30]
009b2f24	ldp x20,x19,[sp, #0x20]
009b2f28	ldp x22,x21,[sp, #0x10]
009b2f2c	ldp x24,x23,[sp], #0x40
009b2f30	ret
