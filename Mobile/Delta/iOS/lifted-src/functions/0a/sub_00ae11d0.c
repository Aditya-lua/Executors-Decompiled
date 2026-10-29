/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae11d0..0xae155c (908 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae11d0_1 {
    struct st_ae11d0_0 *field_0;
    void* field_8;
} st_ae11d0_1;

typedef struct st_ae11d0_0 {
    struct st_ae11d0_0 *field_0;
    char field_2;
    char padding_3[5];
    struct st_ae11d0_0 *field_8;
} st_ae11d0_0;

extern unsigned long long g_c7c2eb;

st_ae11d0_0 * sub_ae11d0(unsigned long a0, long long a1, long long a2, unsigned long long a3)
{
    long long v6;  // x20
    st_ae11d0_0 *v7;  // x22
    st_ae11d0_0 *v16;  // x26
    st_ae11d0_1 *v17;  // x25
    st_ae11d0_0 *v18;  // x0
    st_ae11d0_0 *v19;  // x0
    st_ae11d0_0 *v20;  // x0
    st_ae11d0_0 *v8;  // x23
    st_ae11d0_0 *v9;  // x9
    unsigned long v10;  // x8
    st_ae11d0_0 *v11;  // x28
    long long v12;  // x1
    long long v13;  // x0
    unsigned long v14;  // x8
    unsigned long v15;  // x23
    unsigned long v0;  // [bp-0x90], Other Possible Types: unsigned long long
    unsigned long long v1;  // [bp-0x88]
    unsigned long long v2;  // [bp-0x80]
    unsigned long long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a2;
    if ((int)sub_ad69e4(a1) < 1)
        return 1;
    v7 = 0;
    v3 = a3;
    do
    {
        v8 = sub_ad69f8(a1, v7);
        if (!v8 || (v9 = v8->field_0, !v9 || !*(long long *)&v9->field_2 || 2 > (int)v9->field_0))
        {
            v11 = 0;
            goto LABEL_ae1270;
        }
        else
        {
            v10 = *(short *)*(long long *)&v9->field_2;
            v11 = (unsigned int)((v10 & 0xff00) >> 8) | (unsigned int)v10 * 0x100 & 0xff00ff00;
            if ((unsigned int)v11 != 2)
            {
                if ((unsigned int)v11 == 1)
                {
                    v0 = a3;
                    v1 = &g_c7c2eb;
                    v12 = "%*sIPv4";
                    v13 = v6;
                    goto LABEL_ae1284;
                }
LABEL_ae1270:
                v1 = &g_c7c2eb;
                v2 = v11;
                v0 = a3;
                v12 = "%*sUnknown AFI %u";
                v13 = v6;
                goto LABEL_ae1284;
            }
            else
            {
                v0 = v3;
                v1 = &g_c7c2eb;
                v12 = "%*sIPv6";
                v13 = v6;
LABEL_ae1284:
                sub_9d524c(v13, v12);
                if ((int)v8->field_0->field_0 < 3)
                    continue;
                v14 = *(char *)(*(long long *)&v8->field_0->field_2 + 2);
                if (63 >= (int)v14)
                {
                    if (2 >= (int)v14)
                    {
                        if ((unsigned int)v14 == 1)
                        {
                            sub_9d4888(v6, " (Unicast)");
                            continue;
                        }
                        else if ((unsigned int)v14 == 2)
                        {
                            sub_9d4888(v6, " (Multicast)");
                            continue;
                        }
                    }
                    else
                    {
                        if ((unsigned int)v14 == 3)
                        {
                            sub_9d4888(v6, " (Unicast/Multicast)");
                            continue;
                        }
                        else if ((unsigned int)v14 == 4)
                        {
                            sub_9d4888(v6, " (MPLS)");
                            continue;
                        }
                    }
                    goto LABEL_ae13c8;
                }
                if (65 >= (int)v14)
                {
                    if ((unsigned int)v14 != 64)
                    {
                        if ((unsigned int)v14 == 65)
                        {
                            sub_9d4888(v6, " (VPLS)");
                            continue;
                        }
                    }
                    else
                    {
                        sub_9d4888(v6, " (Tunnel)");
                        continue;
                    }
                    goto LABEL_ae13c8;
                }
                else if ((unsigned int)v14 != 66)
                {
                    if ((unsigned int)v14 == 128)
                    {
                        sub_9d4888(v6, " (MPLS-labeled VPN)");
                        continue;
                    }
LABEL_ae13c8:
                    v0 = v14;
                    sub_9d524c(v6, " (Unknown SAFI %u)");
                }
                else
                {
                    sub_9d4888(v6, " (BGP MDT)");
                }
            }
        }
        if (*(int *)*(long long *)&v8->field_2 == 1)
        {
            sub_9d4888(v6, ":\n");
            v15 = *(long long *)(*(long long *)&v8->field_2 + 8);
            if ((int)sub_ad69e4(v15) >= 1)
            {
                v16 = 0;
                do
                {
                    v17 = sub_ad69f8(v15, v16);
                    v0 = (unsigned int)a3 + 2;
                    v1 = &g_c7c2eb;
                    sub_9d524c(v6, "%*s");
                    if ((int)v17->field_0 != 1)
                    {
                        if (!(int)v17->field_0)
                        {
                            v18 = sub_ae1a0c(v6, v11, 0, v17->field_8);
                            if (!(unsigned int)v18)
                                return v18;
                            v0 = *(int *)v17->field_8 * 8 - ((int)v17->field_8[16] & 7);
                            sub_9d524c(v6, "/%d\n");
                        }
                    }
                    else
                    {
                        v19 = sub_ae1a0c(v6, v11, 0, *(long long *)v17->field_8);
                        if (!(unsigned int)v19)
                            return v19;
                        sub_9d4888(v6, "-");
                        v20 = sub_ae1a0c(v6, v11, 0xff, (long long)v17->field_8[8]);
                        if (!(unsigned int)v20)
                            return v20;
                        sub_9d4888(v6, "\n");
                    }
                } while ((v16 = (unsigned int)v16 + 1, (int)sub_ad69e4(v15) > (int)(unsigned int)v16));
            }
        }
        else if (!*(int *)*(long long *)&v8->field_2)
        {
            sub_9d4888(v6, ": inherit\n");
        }
        v7 = (unsigned int)v7 + 1;
    } while ((int)sub_ad69e4(a1) > (int)(unsigned int)v7);
    return 1;
}
