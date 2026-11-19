; ossl_chacha20_einit @ 00b29fc4
00b29fc4	stp x22,x21,[sp, #-0x30]!
00b29fc8	stp x20,x19,[sp, #0x10]
00b29fcc	mov x19,x5
00b29fd0	mov x5,xzr
00b29fd4	stp x29,x30,[sp, #0x20]
00b29fd8	add x29,sp,#0x20
00b29fdc	mov x22,x3
00b29fe0	mov x20,x0
00b29fe4	bl 0x00c41250
00b29fe8	mov w21,w0
00b29fec	cbz x22,0x00b2a004
00b29ff0	cbz w21,0x00b2a004
00b29ff4	ldr x8,[x20, #0xa8]
00b29ff8	mov x0,x20
00b29ffc	ldr x8,[x8, #0x18]
00b2a000	blr x8
00b2a004	cbz w21,0x00b2a020
00b2a008	mov x0,x20
00b2a00c	mov x1,x19
00b2a010	bl 0x00b2a034
00b2a014	cmp w0,#0x0
00b2a018	csel w0,wzr,w21,eq
00b2a01c	b 0x00b2a024
00b2a020	mov w0,wzr
00b2a024	ldp x29,x30,[sp, #0x20]
00b2a028	ldp x20,x19,[sp, #0x10]
00b2a02c	ldp x22,x21,[sp], #0x30
00b2a030	ret
