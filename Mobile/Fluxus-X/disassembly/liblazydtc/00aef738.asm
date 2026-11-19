; ERR_print_errors_fp @ 00aef738
00aef738	str x19,[sp, #-0x20]!
00aef73c	mov w1,wzr
00aef740	stp x29,x30,[sp, #0x10]
00aef744	add x29,sp,#0x10
00aef748	bl 0x00c37810
00aef74c	cbz x0,0x00aef774
00aef750	mov x19,x0
00aef754	adrp x0,0xaef000
00aef758	add x0,x0,#0x724
00aef75c	mov x1,x19
00aef760	bl 0x00aef268
00aef764	ldp x29,x30,[sp, #0x10]
00aef768	mov x0,x19
00aef76c	ldr x19,[sp], #0x20
00aef770	b 0x00c31a40
00aef774	ldp x29,x30,[sp, #0x10]
00aef778	ldr x19,[sp], #0x20
00aef77c	ret
