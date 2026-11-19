; psa_crypto_local_input_alloc @ 00b877f8
00b877f8	str x21,[sp, #-0x30]!
00b877fc	stp x20,x19,[sp, #0x10]
00b87800	stp x29,x30,[sp, #0x20]
00b87804	add x29,sp,#0x20
00b87808	mov x21,x2
00b8780c	mov x19,x1
00b87810	mov x20,x0
00b87814	stp xzr,xzr,[x2]
00b87818	cbz x1,0x00b87840
00b8781c	mov w1,#0x1
00b87820	mov x0,x19
00b87824	bl 0x00c30a30
00b87828	str x0,[x21]
00b8782c	cbz x0,0x00b87848
00b87830	mov x1,x20
00b87834	mov x2,x19
00b87838	str x19,[x21, #0x8]
00b8783c	bl 0x00c2ffd0
00b87840	mov w0,wzr
00b87844	b 0x00b8784c
00b87848	mov w0,#0xffffff73
00b8784c	ldp x29,x30,[sp, #0x20]
00b87850	ldp x20,x19,[sp, #0x10]
00b87854	ldr x21,[sp], #0x30
00b87858	ret
