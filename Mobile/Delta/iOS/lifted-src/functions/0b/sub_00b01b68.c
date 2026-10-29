/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb01b68..0xb01d60 (504 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

int sub_b01b68(void* a0)
{
    unsigned long v8;  // x8
    unsigned long v9;  // x20
    unsigned long v10;  // x0
    unsigned long v11;  // x21
    unsigned int v12;  // w22
    unsigned int v13;  // w0
    unsigned int v0;  // [bp-0x6c]
    unsigned int v1;  // [bp-0x68]
    unsigned long v2;  // [bp-0x64]
    unsigned int v3;  // [bp-0x5c]
    unsigned long v4;  // [bp-0x58]
    unsigned long v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v8 = (long long)a0[48];
    switch (v8)
    {
    case 16:
LABEL_b01bd0:
        v9 = sub_a4e104((long long)a0[24]);
        v10 = *(long long *)a0;
        if (v10 || (v10 = sub_a4bc70(0), *(unsigned long *)a0 = v10, v10))
        {
            if (sub_a4d03c(v10, v9, a0 + 56, 0, 0))
            {
                v2 = (long long)a0[168];
                v3 = (int)a0[176];
                *(char *)&a0[440] = (char)a0[440] & 251;
                *(unsigned long long *)&a0[0x88] = 0;
                *(unsigned long long *)&a0[144] = 0;
                v0 = 16;
                v1 = 0;
                if (sub_c672c8(*(long long *)a0, &v4, &v0, &v1, 16) && !(*(unsigned long *)&a0[120] = v4, v0 = 16, v1 = 1, !sub_c672c8(*(long long *)a0, &v4, &v0, &v1, 16)))
                {
                    *(unsigned long *)&a0[128] = v4;
                    if ((long long)a0[48])
                    {
                        v11 = 0;
                        v12 = 2;
                        do
                        {
                            v0 = 16;
                            v1 = v12;
                            if (!sub_c672c8(*(long long *)a0, &v4, &v0, &v1, 16))
                                goto LABEL_b01d14;
                        } while ((*(unsigned long *)((char *)a0 + v11 + 88) = v4, v12 += 1, v11 += 8, v11 < (unsigned long long)(long long)a0[48]));
                    }
                    if (sub_a4d03c(*(long long *)a0, v9, a0 + 88, 0, 0))
                    {
                        *(char *)&a0[440] = (char)a0[440] & 231;
                        sub_a4bbe4(v9);
                        v13 = 1;
                        break;
                    }
                }
            }
        }
        goto LABEL_b01d14;
    case 32:
        goto LABEL_b01bd0;
    case 24:
        goto LABEL_b01bd0;
    default:
        v9 = 0;
LABEL_b01d14:
        sub_a4bca0(*(long long *)a0);
        sub_a4bbe4(v9);
        v13 = 0;
        *(unsigned long long *)a0 = 0;
        break;
    }
    if (*(long long *)&g_10002b0 == v5)
        return v13;
    ___stack_chk_fail();
}
