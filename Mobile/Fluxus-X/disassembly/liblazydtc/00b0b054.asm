; X509_OBJECT_idx_by_subject @ 00b0b054
00b0b054	sub sp,sp,#0x1b0
00b0b058	stp x29,x30,[sp, #0x1a0]
00b0b05c	add x29,sp,#0x1a0
00b0b060	str x28,[sp, #0x190]
00b0b064	stur w1,[x29, #-0x20]
00b0b068	cbz w1,0x00b0b08c
00b0b06c	cmp w1,#0x2
00b0b070	b.eq 0x00b0b094
00b0b074	cmp w1,#0x1
00b0b078	b.ne 0x00b0b0a4
00b0b07c	mov x8,sp
00b0b080	stur x8,[x29, #-0x18]
00b0b084	add x8,x8,#0x48
00b0b088	b 0x00b0b0a0
00b0b08c	mov w0,#0xffffffff
00b0b090	b 0x00b0b0b0
00b0b094	mov x8,sp
00b0b098	stur x8,[x29, #-0x18]
00b0b09c	add x8,x8,#0x18
00b0b0a0	str x2,[x8]
00b0b0a4	sub x1,x29,#0x20
00b0b0a8	mov x2,xzr
00b0b0ac	bl 0x00c40220
00b0b0b0	ldp x29,x30,[sp, #0x1a0]
00b0b0b4	ldr x28,[sp, #0x190]
00b0b0b8	add sp,sp,#0x1b0
00b0b0bc	ret
