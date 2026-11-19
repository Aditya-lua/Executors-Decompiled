; FUN_0094aa34 @ 0094aa34
0094aa34	stp x20,x19,[sp, #-0x20]!
0094aa38	stp x29,x30,[sp, #0x10]
0094aa3c	add x29,sp,#0x10
0094aa40	mov x20,x1
0094aa44	mov x1,x0
0094aa48	mov x0,x20
0094aa4c	mov x19,x2
0094aa50	bl 0x0094aa74
0094aa54	mov w8,w0
0094aa58	mov w0,wzr
0094aa5c	tbz w8,#0x0,0x0094aa68
0094aa60	mov w0,#0x1
0094aa64	str x20,[x19]
0094aa68	ldp x29,x30,[sp, #0x10]
0094aa6c	ldp x20,x19,[sp], #0x20
0094aa70	ret
