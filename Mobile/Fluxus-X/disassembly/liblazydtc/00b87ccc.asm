; psa_hash_abort @ 00b87ccc
00b87ccc	str x19,[sp, #-0x20]!
00b87cd0	stp x29,x30,[sp, #0x10]
00b87cd4	add x29,sp,#0x10
00b87cd8	mov x19,x0
00b87cdc	ldr w0,[x0]
00b87ce0	cbz w0,0x00b87d00
00b87ce4	cmp w0,#0x1
00b87ce8	b.ne 0x00b87cf8
00b87cec	add x0,x19,#0x8
00b87cf0	bl 0x00c42fe0
00b87cf4	b 0x00b87cfc
00b87cf8	mov w0,#0xffffff77
00b87cfc	str wzr,[x19]
00b87d00	ldp x29,x30,[sp, #0x10]
00b87d04	ldr x19,[sp], #0x20
00b87d08	ret
