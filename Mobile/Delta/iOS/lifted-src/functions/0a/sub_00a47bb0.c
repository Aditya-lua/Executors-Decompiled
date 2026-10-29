/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa47bb0..0xa47e38 (648 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a47bb0_0 {
    char padding_0[120];
    void* field_78;
} st_a47bb0_0;


double sub_a47bb0(st_a47bb0_0 *a0, void* a1, unsigned int a2, void* ptr)
{
    void* v2;  // x19
    unsigned long v3;  // d0
    unsigned int v12;  // w8
    unsigned long v13;  // d0
    unsigned long long v14;  // 4118
    void* v15;  // x0
    long long v16;  // x1
    unsigned long v17;  // d0
    unsigned long v18;  // d0
    unsigned long long v19;  // 4118
    unsigned long v20;  // d0
    unsigned long v21;  // d0
    unsigned long v4;  // x8
    unsigned long v22;  // d0
    unsigned long long v23;  // 4118
    unsigned long v24;  // d0
    unsigned long v25;  // d0
    unsigned long v5;  // x8
    unsigned long long v6;  // x20
    unsigned long v7;  // x20
    unsigned long v9;  // d0
    unsigned int v10;  // w8
    unsigned int v11;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_78;
    if (a1 > 16)
    {
        switch (a1)
        {
        case 22:
            if (a2 == 13)
            {
                v4 = *(long long *)ptr;
                *(long long *)&v2[0x99] = (long long)ptr[5];
                *(unsigned long *)&v2[148] = v4;
                v5 = (short)ptr[11];
                v6 = (unsigned int)((v5 & 0xff00) >> 8) | (unsigned int)v5 * 0x100 & 0xff00ff00;
                if (sub_a50720())
                {
                    *(unsigned long long *)&v2[200] = v6 & 0xffffffff;
                    *(int *)&v2[36] = (int)v2[120];
                    v9 = __dirty_unsupported_Iop_ZeroHI64ofV128(__double_as_longlong((double)v2[124]) ^ __double_as_longlong((double)v2[148]));
                    *(unsigned long *)&v2[40] = v9;
                    *(unsigned int *)&v2[188] = 0;
                    return v9;
                }
                v7 = (unsigned int)v6 - 16;
                if ((unsigned int)v6 >= 16)
                {
                    *(unsigned short *)&v2[159] = (((((v7 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v7 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v7 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v7 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                    *(unsigned long long *)&v2[200] = v7 & 0xffffffff;
                    *(int *)&v2[36] = (int)v2[120];
                    v9 = __dirty_unsupported_Iop_ZeroHI64ofV128(__double_as_longlong((double)v2[124]) ^ __double_as_longlong((double)v2[148]));
                    *(unsigned long *)&v2[40] = v9;
                    *(unsigned int *)&v2[188] = 0;
                    return v9;
                }
            }
            break;
        case 17:
            v14 = arm64g_calculate_condition(49, a2 - 0x11, 16, 0);
            if (!(v14 & 1))
            {
                if (ptr)
                {
                    _memcpy(v2 + 132, ptr, a2);
                    *(unsigned int *)&v2[192] = a2;
                    return v17;
                }
                return v17;
            }
            break;
        case 23:
            return v17;
        case 18:
            if (a2 == 12)
            {
                v10 = *(int *)ptr;
                *(unsigned int *)&v2[36] = v10;
                *(unsigned int *)&v2[120] = v10;
                v11 = (int)ptr[4];
                *(unsigned int *)&v2[40] = v11;
                *(unsigned int *)&v2[124] = v11;
                v12 = (int)ptr[8];
                *(unsigned int *)&v2[44] = v12;
                *(unsigned int *)&v2[128] = v12;
                return v13;
            }
            break;
        case 37:
            *(int *)ptr = (int)v2[196];
            return v3;
        default:
LABEL_a47df0:
            goto LABEL_a47df0;
        }
    }
    else if (8 >= a1)
    {
        switch (a1)
        {
        case 0:
            if (v2)
            {
                *(unsigned long long *)&v2[168] = 0;
                *(unsigned long long *)&v2[176] = 0;
                *(unsigned long long *)&v2[184] = 0;
                *(unsigned long *)&v2[192] = 0xc00000000;
                *(unsigned long long *)&v2[200] = 0xffffffffffffffff;
                *(unsigned long long *)&v2[156] = 0;
                *(unsigned long long *)&v2[148] = 0;
                return v18;
            }
            v2 = sub_a6bffc(sub_aa4d58() + 208, "crypto/evp/e_chacha20_poly1305.c", 506);
            a0->field_78 = v2;
            if (v2)
            {
                *(unsigned long long *)&v2[168] = 0;
                *(unsigned long long *)&v2[176] = 0;
                *(unsigned long long *)&v2[184] = 0;
                *(unsigned long *)&v2[192] = 0xc00000000;
                *(unsigned long long *)&v2[200] = 0xffffffffffffffff;
                *(unsigned long long *)&v2[156] = 0;
                *(unsigned long long *)&v2[148] = 0;
                return v18;
            }
            sub_a368c8();
            sub_a369bc("crypto/evp/e_chacha20_poly1305.c", 508, "chacha20_poly1305_ctrl");
            v16 = 134;
LABEL_a47e1c:
            sub_a36abc(6, v16, 0);
        case 8:
            if (v2)
            {
                v15 = sub_a6dac4(v2, sub_aa4d58() + 208, "crypto/evp/e_chacha20_poly1305.c", 525);
                *(void* *)&ptr[120] = v15;
                if (v15)
                    return v17;
                sub_a368c8();
                sub_a369bc("crypto/evp/e_chacha20_poly1305.c", 527, "chacha20_poly1305_ctrl");
                v16 = 173;
                goto LABEL_a47e1c;
            }
            else
            {
                return v17;
            }
        default:
LABEL_a47df0:
            return v22;
        }
    }
    else
    {
        switch (a1)
        {
        case 9:
            v23 = arm64g_calculate_condition(49, a2 - 13, 12, 0);
            if (!(v23 & 1))
            {
                *(unsigned int *)&v2[196] = a2;
                return v24;
            }
            break;
        case 16:
            v19 = arm64g_calculate_condition(49, a2 - 0x11, 16, 0);
            if (!(v19 & 1))
            {
                if (sub_a50720())
                {
                    _memcpy(ptr, v2 + 132, a2);
                    return v20;
                }
                return v21;
            }
            break;
        default:
LABEL_a47df0:
            goto LABEL_a47df0;
        }
    }
    return v25;
}
