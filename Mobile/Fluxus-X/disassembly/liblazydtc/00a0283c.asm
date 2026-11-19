; BN_is_bit_set @ 00a0283c
00a0283c	tbnz w1,#0x1f,0x00a02870
00a02840	ldr w8,[x0, #0x8]
00a02844	lsr w9,w1,#0x6
00a02848	cmp w8,w9
00a0284c	mov w8,wzr
00a02850	b.le 0x00a02868
00a02854	ldr x8,[x0]
00a02858	ldr x8,[x8, w9, UXTW #0x3]
00a0285c	and w9,w1,#0x3f
00a02860	lsr x8,x8,x9
00a02864	and w8,w8,#0x1
00a02868	mov w0,w8
00a0286c	ret
00a02870	mov w0,wzr
00a02874	ret
