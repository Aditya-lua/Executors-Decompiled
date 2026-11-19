; ossl_cipher_hw_chunked_ofb128 @ 00b68884
00b68884	sub sp,sp,#0x80
00b68888	stp x24,x23,[sp, #0x40]
00b6888c	stp x22,x21,[sp, #0x50]
00b68890	stp x20,x19,[sp, #0x60]
00b68894	mov x20,x3
00b68898	mov x23,x2
00b6889c	mov x21,x1
00b688a0	lsr x8,x3,#0x1e
00b688a4	mov x19,x0
00b688a8	stp x28,x27,[sp, #0x20]
00b688ac	stp x26,x25,[sp, #0x30]
00b688b0	stp x29,x30,[sp, #0x70]
00b688b4	add x29,sp,#0x70
00b688b8	cbz x8,0x00b6893c
00b688bc	orr x26,xzr,#-0x40000000
00b688c0	ldr w8,[x19, #0xa0]
00b688c4	add x28,x20,x26
00b688c8	and x22,x28,#-0x40000000
00b688cc	mov w27,#0x40000000
00b688d0	add x9,x22,x27
00b688d4	add x24,x19,#0x20
00b688d8	str x9,[sp, #0x8]
00b688dc	add x9,x23,x9
00b688e0	mov x25,x21
00b688e4	str x9,[sp, #0x10]
00b688e8	str w8,[sp, #0x18]
00b688ec	ldr x3,[x19, #0xb0]
00b688f0	ldr x6,[x19, #0x30]
00b688f4	mov w2,#0x40000000
00b688f8	add x5,sp,#0x18
00b688fc	mov x0,x23
00b68900	mov x1,x25
00b68904	mov x4,x24
00b68908	bl 0x00c3e450
00b6890c	ldr w8,[sp, #0x18]
00b68910	add x20,x20,x26
00b68914	add x23,x23,x27
00b68918	lsr x9,x20,#0x1e
00b6891c	add x25,x25,x27
00b68920	str w8,[x19, #0xa0]
00b68924	cbnz x9,0x00b688e8
00b68928	ldp x8,x0,[sp, #0x8]
00b6892c	sub x20,x28,x22
00b68930	add x21,x21,x8
00b68934	cbnz x20,0x00b68944
00b68938	b 0x00b68970
00b6893c	mov x0,x23
00b68940	cbz x20,0x00b68970
00b68944	ldr w8,[x19, #0xa0]
00b68948	add x4,x19,#0x20
00b6894c	add x5,sp,#0x1c
00b68950	mov x1,x21
00b68954	str w8,[sp, #0x1c]
00b68958	ldr x3,[x19, #0xb0]
00b6895c	ldr x6,[x19, #0x30]
00b68960	mov x2,x20
00b68964	bl 0x00c3e450
00b68968	ldr w8,[sp, #0x1c]
00b6896c	str w8,[x19, #0xa0]
00b68970	ldp x29,x30,[sp, #0x70]
00b68974	ldp x20,x19,[sp, #0x60]
00b68978	ldp x22,x21,[sp, #0x50]
00b6897c	ldp x24,x23,[sp, #0x40]
00b68980	ldp x26,x25,[sp, #0x30]
00b68984	ldp x28,x27,[sp, #0x20]
00b68988	mov w0,#0x1
00b6898c	add sp,sp,#0x80
00b68990	ret
