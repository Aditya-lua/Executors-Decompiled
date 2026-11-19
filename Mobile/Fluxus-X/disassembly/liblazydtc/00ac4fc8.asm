; ossl_prop_defn_get @ 00ac4fc8
00ac4fc8	sub sp,sp,#0x50
00ac4fcc	adrp x2,0xc7c000
00ac4fd0	stp x20,x19,[sp, #0x30]
00ac4fd4	mov x20,x1
00ac4fd8	add x2,x2,#0x688
00ac4fdc	mov w1,#0x2
00ac4fe0	str x21,[sp, #0x20]
00ac4fe4	stp x29,x30,[sp, #0x40]
00ac4fe8	add x29,sp,#0x40
00ac4fec	mov x19,x0
00ac4ff0	bl 0x00c3b520
00ac4ff4	cbz x0,0x00ac5034
00ac4ff8	mov x21,x0
00ac4ffc	mov x0,x19
00ac5000	bl 0x00c3df00
00ac5004	cbz w0,0x00ac5030
00ac5008	add x1,sp,#0x8
00ac500c	mov x0,x21
00ac5010	str x20,[sp, #0x8]
00ac5014	bl 0x00c34de0
00ac5018	mov x20,x0
00ac501c	mov x0,x19
00ac5020	bl 0x00c3df10
00ac5024	cbz x20,0x00ac5030
00ac5028	ldr x0,[x20, #0x8]
00ac502c	b 0x00ac5034
00ac5030	mov x0,xzr
00ac5034	ldp x29,x30,[sp, #0x40]
00ac5038	ldp x20,x19,[sp, #0x30]
00ac503c	ldr x21,[sp, #0x20]
00ac5040	add sp,sp,#0x50
00ac5044	ret
