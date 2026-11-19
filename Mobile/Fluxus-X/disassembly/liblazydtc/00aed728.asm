; ossl_err_load_UI_strings @ 00aed728
00aed728	stp x29,x30,[sp, #-0x10]!
00aed72c	mov w0,#0x68
00aed730	movk w0,#0x1400, LSL #16
00aed734	mov x29,sp
00aed738	bl 0x00c35520
00aed73c	cbnz x0,0x00aed74c
00aed740	adrp x0,0xc7e000
00aed744	add x0,x0,#0x150
00aed748	bl 0x00c35510
00aed74c	mov w0,#0x1
00aed750	ldp x29,x30,[sp], #0x10
00aed754	ret
