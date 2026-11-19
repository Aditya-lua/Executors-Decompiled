; PKCS12_SAFEBAG_get0_p8inf @ 00abc728
00abc728	str x19,[sp, #-0x20]!
00abc72c	stp x29,x30,[sp, #0x10]
00abc730	mov x19,x0
00abc734	ldr x0,[x0]
00abc738	add x29,sp,#0x10
00abc73c	bl 0x00c37750
00abc740	cmp w0,#0x96
00abc744	mov x0,xzr
00abc748	b.ne 0x00abc750
00abc74c	ldr x0,[x19, #0x8]
00abc750	ldp x29,x30,[sp, #0x10]
00abc754	ldr x19,[sp], #0x20
00abc758	ret
