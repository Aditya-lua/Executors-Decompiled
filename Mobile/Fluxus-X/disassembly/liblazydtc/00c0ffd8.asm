; FUN_00c0ffd8 @ 00c0ffd8
00c0ffd8	paciasp
00c0ffdc	stp x29,x30,[sp, #-0x30]!
00c0ffe0	str x21,[sp, #0x10]
00c0ffe4	stp x20,x19,[sp, #0x20]
00c0ffe8	mov x29,sp
00c0ffec	ldp x19,x8,[x0]
00c0fff0	sub x8,x8,x19
00c0fff4	cmp x2,x8
00c0fff8	b.hi 0x00c10010
00c0fffc	mov x20,x0
00c10000	mov x0,x19
00c10004	mov x21,x2
00c10008	bl 0x00c300b0
00c1000c	cbz w0,0x00c10028
00c10010	mov w0,wzr
00c10014	ldp x20,x19,[sp, #0x20]
00c10018	ldr x21,[sp, #0x10]
00c1001c	ldp x29,x30,[sp], #0x30
00c10020	autiasp
00c10024	ret
00c10028	add x8,x19,x21
00c1002c	mov w0,#0x1
00c10030	str x8,[x20]
00c10034	b 0x00c10014
