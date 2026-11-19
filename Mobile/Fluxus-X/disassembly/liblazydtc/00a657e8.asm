; evp_keymgmt_util_export @ 00a657e8
00a657e8	cbz x0,0x00a65808
00a657ec	mov x4,x3
00a657f0	mov x3,x2
00a657f4	cbz x2,0x00a65808
00a657f8	mov w2,w1
00a657fc	ldp x8,x1,[x0, #0x60]
00a65800	mov x0,x8
00a65804	b 0x00c3d130
00a65808	mov w0,wzr
00a6580c	ret
