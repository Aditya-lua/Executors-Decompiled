; curl_mime_headers @ 00926ab0
00926ab0	str x21,[sp, #-0x30]!
00926ab4	stp x20,x19,[sp, #0x10]
00926ab8	stp x29,x30,[sp, #0x20]
00926abc	add x29,sp,#0x20
00926ac0	mov w20,w2
00926ac4	mov x21,x1
00926ac8	mov x19,x0
00926acc	cbz x0,0x00926b14
00926ad0	ldr w8,[x19, #0x14]
00926ad4	tbz w8,#0x0,0x00926af4
00926ad8	ldr x0,[x19, #0x50]
00926adc	cmp x0,x21
00926ae0	b.eq 0x00926aec
00926ae4	bl 0x00c31040
00926ae8	ldr w8,[x19, #0x14]
00926aec	and w8,w8,#0xfffffffe
00926af0	str w8,[x19, #0x14]
00926af4	mov w0,wzr
00926af8	str x21,[x19, #0x50]
00926afc	cbz x21,0x00926b18
00926b00	cbz w20,0x00926b18
00926b04	mov w0,wzr
00926b08	orr w8,w8,#0x1
00926b0c	str w8,[x19, #0x14]
00926b10	b 0x00926b18
00926b14	mov w0,#0x2b
00926b18	ldp x29,x30,[sp, #0x20]
00926b1c	ldp x20,x19,[sp, #0x10]
00926b20	ldr x21,[sp], #0x30
00926b24	ret
