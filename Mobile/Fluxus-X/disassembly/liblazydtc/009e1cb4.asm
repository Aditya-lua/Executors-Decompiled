; dtls1_retransmit_buffered_messages @ 009e1cb4
009e1cb4	sub sp,sp,#0x30
009e1cb8	stp x29,x30,[sp, #0x20]
009e1cbc	ldr x8,[x0, #0x4b8]
009e1cc0	str x19,[sp, #0x10]
009e1cc4	mov x19,x0
009e1cc8	add x29,sp,#0x20
009e1ccc	ldr x0,[x8, #0x120]
009e1cd0	str wzr,[sp, #0xc]
009e1cd4	bl 0x00c34550
009e1cd8	stur x0,[x29, #-0x8]
009e1cdc	sub x0,x29,#0x8
009e1ce0	bl 0x00c34560
009e1ce4	cbz x0,0x009e1d18
009e1ce8	ldr x8,[x0, #0x8]
009e1cec	add x2,sp,#0xc
009e1cf0	mov x0,x19
009e1cf4	ldrh w9,[x8, #0x10]
009e1cf8	ldr w8,[x8, #0x28]
009e1cfc	lsl w9,w9,#0x1
009e1d00	sub w1,w9,w8
009e1d04	bl 0x009e1d2c
009e1d08	cmp w0,#0x1
009e1d0c	b.ge 0x009e1cdc
009e1d10	mov w0,#0xffffffff
009e1d14	b 0x009e1d1c
009e1d18	mov w0,#0x1
009e1d1c	ldp x29,x30,[sp, #0x20]
009e1d20	ldr x19,[sp, #0x10]
009e1d24	add sp,sp,#0x30
009e1d28	ret
