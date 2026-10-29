/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaad8dc..0xaadc00 (804 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aad8dc_0 {
    struct st_aad8dc_0 *field_0;
    struct st_aad8dc_0 *field_8;
    struct st_aad8dc_0 *field_10;
    struct st_aad8dc_0 *field_18;
} st_aad8dc_0;

extern unsigned long long g_c7c2eb;

st_aad8dc_0 * sub_aad8dc(long long a0, st_aad8dc_0 *a1, st_aad8dc_0 *a2, unsigned int a3)
{
    unsigned long v3;  // x21
    st_aad8dc_0 *v4;  // x0
    st_aad8dc_0 *v5;  // x23
    unsigned long long v6;  // x8
    st_aad8dc_0 *v7;  // w0
    st_aad8dc_0 *v8;  // w0
    unsigned long long v0;  // [bp-0x50]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (sub_9d4cf4())
    {
        if (a1)
        {
            if (!a2)
            {
                return (int)sub_9d4888(a0) > 0;
            }
            else if (1 > (int)sub_9d4888(a0, "PSS parameter restrictions:"))
            {
                return 0;
            }
        }
        else
        {
            if (!a2)
                return (int)sub_9d4888(a0) > 0;
        }
        if ((int)sub_9d4888(a0, "\n") >= 1)
        {
            if (!a1)
                v3 = a3;
            else
                v3 = a3 + 2;
            if (sub_9d4cf4() && (int)sub_9d4888(a0, "Hash Algorithm: ") >= 1 && !a2->field_0 && (int)sub_9d4888(a0, "sha1 (default)") >= 1 && (int)sub_9d4888(a0, "\n") >= 1 && sub_9d4cf4(a0, v3, 128) && (int)sub_9d4888(a0, "Mask Algorithm: ") >= 1)
            {
                if (!a2->field_8)
                {
LABEL_aadac0:
                    if ((int)sub_9d4888(a0) < 1)
                    {
                        sub_9cf6c8(0);
                        return 0;
                    }
                    v5 = 0;
LABEL_aadadc:
                    sub_9d4888(a0, "\n");
                    if (sub_9d4cf4(a0, v3, 128))
                    {
                        v6 = "Minimum";
                        if (!a1)
                            v6 = &g_c7c2eb;
                        v0 = v6;
                        if ((int)sub_9d524c() >= 1)
                        {
                            if (a2->field_10)
                                v7 = (st_aad8dc_0 *)(unsigned int)sub_9c994c(a0);
                            else
                                v7 = (st_aad8dc_0 *)(unsigned int)sub_9d4888(a0, "14 (default)");
                            if (v7 >= 1)
                            {
                                sub_9d4888(a0, "\n");
                                if (sub_9d4cf4(a0, v3, 128) && (int)sub_9d4888(a0, "Trailer Field: 0x") >= 1)
                                {
                                    if (a2->field_18)
                                        v8 = (st_aad8dc_0 *)(unsigned int)sub_9c994c(a0);
                                    else
                                        v8 = (st_aad8dc_0 *)(unsigned int)sub_9d4888(a0, "01 (default)");
                                    if (v8 >= 1)
                                    {
                                        sub_9d4888(a0, "\n");
                                        sub_9cf6c8(v5);
                                        return 1;
                                    }
                                }
                            }
                        }
                    }
                    sub_9cf6c8(v5);
                    return 0;
                }
                else if ((int)sub_9c3060(a0, a2->field_8->field_0) >= 1 && (int)sub_9d4888(a0, " with ") >= 1)
                {
                    v4 = sub_9cf9b4(a2->field_8);
                    if (v4)
                    {
                        v5 = v4;
                        if (1 > (int)sub_9c3060(a0, v4->field_0))
                        {
                            sub_9cf6c8(v5);
                            return 0;
                        }
                        goto LABEL_aadadc;
                    }
                    else
                    {
                        goto LABEL_aadac0;
                    }
                    goto LABEL_aadac0;
                }
            }
        }
    }
    sub_9cf6c8(0);
    return 0;
}
