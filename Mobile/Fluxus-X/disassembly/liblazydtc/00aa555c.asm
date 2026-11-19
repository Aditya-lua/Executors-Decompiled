; OSSL_trace_get_category_name @ 00aa555c
00aa555c	cmp w0,#0x11
00aa5560	b.ls 0x00aa556c
00aa5564	mov x0,xzr
00aa5568	ret
00aa556c	adrp x8,0xc6d000
00aa5570	add x8,x8,#0x938
00aa5574	add x8,x8,w0, SXTW  #0x4
00aa5578	ldr w9,[x8, #0x8]
00aa557c	ldr x8,[x8]
00aa5580	cmp w9,w0
00aa5584	csel x0,x8,xzr,eq
00aa5588	ret
