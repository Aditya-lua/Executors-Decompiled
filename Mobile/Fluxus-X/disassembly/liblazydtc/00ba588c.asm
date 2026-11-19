; mbedtls_rsa_import @ 00ba588c
00ba588c	stp x24,x23,[sp, #-0x40]!
00ba5890	stp x22,x21,[sp, #0x10]
00ba5894	stp x20,x19,[sp, #0x20]
00ba5898	stp x29,x30,[sp, #0x30]
00ba589c	add x29,sp,#0x30
00ba58a0	mov x21,x5
00ba58a4	mov x22,x4
00ba58a8	mov x23,x3
00ba58ac	mov x24,x2
00ba58b0	mov x20,x1
00ba58b4	mov x19,x0
00ba58b8	cbz x1,0x00ba58cc
00ba58bc	add x0,x19,#0x10
00ba58c0	mov x1,x20
00ba58c4	bl 0x00c41b60
00ba58c8	cbnz w0,0x00ba591c
00ba58cc	cbz x24,0x00ba58e0
00ba58d0	add x0,x19,#0x40
00ba58d4	mov x1,x24
00ba58d8	bl 0x00c41b60
00ba58dc	cbnz w0,0x00ba591c
00ba58e0	cbz x23,0x00ba58f4
00ba58e4	add x0,x19,#0x50
00ba58e8	mov x1,x23
00ba58ec	bl 0x00c41b60
00ba58f0	cbnz w0,0x00ba591c
00ba58f4	cbz x22,0x00ba5908
00ba58f8	add x0,x19,#0x30
00ba58fc	mov x1,x22
00ba5900	bl 0x00c41b60
00ba5904	cbnz w0,0x00ba591c
00ba5908	cbz x21,0x00ba5938
00ba590c	add x0,x19,#0x20
00ba5910	mov x1,x21
00ba5914	bl 0x00c41b60
00ba5918	cbz w0,0x00ba5938
00ba591c	mov w8,#0xffffbf80
00ba5920	add w0,w0,w8
00ba5924	ldp x29,x30,[sp, #0x30]
00ba5928	ldp x20,x19,[sp, #0x20]
00ba592c	ldp x22,x21,[sp, #0x10]
00ba5930	ldp x24,x23,[sp], #0x40
00ba5934	ret
00ba5938	cbz x20,0x00ba5954
00ba593c	add x0,x19,#0x10
00ba5940	bl 0x00c41d30
00ba5944	mov x8,x0
00ba5948	mov w0,wzr
00ba594c	str x8,[x19, #0x8]
00ba5950	b 0x00ba5924
00ba5954	mov w0,wzr
00ba5958	b 0x00ba5924
