; FUN_00b5dff8 @ 00b5dff8
00b5dff8	stp x22,x21,[sp, #-0x30]!
00b5dffc	stp x20,x19,[sp, #0x10]
00b5e000	stp x29,x30,[sp, #0x20]
00b5e004	add x29,sp,#0x20
00b5e008	mov x19,x3
00b5e00c	mov x20,x2
00b5e010	mov x21,x1
00b5e014	mov x22,x0
00b5e018	bl 0x00c41000
00b5e01c	cbz x22,0x00b5e048
00b5e020	cbz w0,0x00b5e048
00b5e024	ldr x0,[x22, #0x18]
00b5e028	cbz x0,0x00b5e048
00b5e02c	mov x2,x20
00b5e030	mov x3,x19
00b5e034	ldp x29,x30,[sp, #0x20]
00b5e038	ldp x20,x19,[sp, #0x10]
00b5e03c	mov x1,x21
00b5e040	ldp x22,x21,[sp], #0x30
00b5e044	b 0x00c363b0
00b5e048	ldp x29,x30,[sp, #0x20]
00b5e04c	ldp x20,x19,[sp, #0x10]
00b5e050	mov w0,wzr
00b5e054	ldp x22,x21,[sp], #0x30
00b5e058	ret
