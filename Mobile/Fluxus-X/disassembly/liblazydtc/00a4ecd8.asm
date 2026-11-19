; ossl_decoder_fetch_by_number @ 00a4ecd8
00a4ecd8	sub sp,sp,#0x50
00a4ecdc	mov x3,x2
00a4ece0	str x0,[sp]
00a4ece4	mov x0,sp
00a4ece8	mov x2,xzr
00a4ecec	str x19,[sp, #0x30]
00a4ecf0	stp x29,x30,[sp, #0x40]
00a4ecf4	add x29,sp,#0x40
00a4ecf8	str xzr,[sp, #0x20]
00a4ecfc	bl 0x00a4ea54
00a4ed00	ldr x8,[sp, #0x20]
00a4ed04	mov x19,x0
00a4ed08	cbz x8,0x00a4ed14
00a4ed0c	mov x0,x8
00a4ed10	bl 0x00c3b5c0
00a4ed14	mov x0,x19
00a4ed18	ldp x29,x30,[sp, #0x40]
00a4ed1c	ldr x19,[sp, #0x30]
00a4ed20	add sp,sp,#0x50
00a4ed24	ret
