/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaeeb84..0xaeee44 (704 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aeeb84_0 {
    struct st_aeeb84_1 *field_0;
    long long field_8;
} st_aeeb84_0;

typedef struct st_aeeb84_2 {
    struct st_aeeb84_0 *field_0;
    struct st_aeeb84_1 *field_8;
} st_aeeb84_2;

typedef struct st_aeeb84_1 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_aeeb84_1;

extern unsigned long long g_c7c2eb;

int sub_aeeb84(unsigned long a0, long long a1, long long a2, unsigned long long a3)
{
    unsigned long long v6;  // x21
    unsigned long v7;  // x22
    st_aeeb84_1 *v16;  // x8
    st_aeeb84_2 *v8;  // x23
    st_aeeb84_0 *v9;  // x28
    unsigned long long v10;  // x8
    unsigned long long v11;  // x0
    unsigned long long v12;  // x0
    unsigned long long v13;  // x24
    unsigned long long v14;  // x25
    unsigned long long v15;  // x24
    unsigned long long v0;  // [bp-0x80], Other Possible Types: unsigned long
    unsigned long long v1;  // [bp-0x78]
    unsigned long long v2;  // [bp-0x70], Other Possible Types: unsigned long
    unsigned long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v0 = a3;
    v1 = &g_c7c2eb;
    if ((int)sub_9d524c(a2, "%*sUser Notices:\n") >= 1)
    {
        if ((int)sub_ad69e4(a1) >= 1)
        {
            v6 = 0;
            v7 = (unsigned int)a3 + 4;
            while (1)
            {
                v8 = sub_ad69f8(a1, v6);
                v9 = v8->field_0;
                if (v9)
                {
                    v2 = v9->field_0->field_0;
                    v3 = v9->field_0->field_8;
                    v0 = v7;
                    v1 = &g_c7c2eb;
                    if ((int)sub_9d524c(a2, "%*sOrganization: %.*s\n") < 1)
                        return 0;
                    v10 = "s";
                    if (1 >= (int)sub_ad69e4(v9->field_8))
                        v10 = &g_c7c2eb;
                    v1 = &g_c7c2eb;
                    v2 = v10;
                    v0 = v7;
                    if ((int)sub_9d524c() < 1)
                        return 0;
                    if ((int)sub_ad69e4(v9->field_8) >= 1)
                    {
                        v11 = sub_ad69f8(v9->field_8, 0);
                        if (!v11 && (int)sub_9d4888(a2, "(null)") < 1)
                            break;
                        v12 = sub_aef3cc(0, v11);
                        if (!v12)
                            return v12;
                        v13 = v12;
                        if ((int)sub_9d4888(a2, v13) < 1)
                        {
                            sub_a6c2e4(v13, "crypto/x509/v3_usernotice.c", 48);
                            return 0;
                        }
                        sub_a6c2e4(v13, "crypto/x509/v3_usernotice.c", 0x33);
                        if ((int)sub_ad69e4(v9->field_8) >= 2)
                        {
                            v14 = 1;
                            do
                            {
                                v15 = sub_ad69f8(v9->field_8, v14);
                                if ((int)sub_9d4888(a2, ", ") < 1 || !v15 && (int)sub_9d4888(a2, "(null)") < 1)
                                    goto LABEL_aeee20;
                                v12 = sub_aef3cc(0, v15);
                                if (!v12)
                                    return v12;
                                v13 = v12;
                                if ((int)sub_9d4888(a2, v13) <= 0)
                                {
                                    sub_a6c2e4(v13, "crypto/x509/v3_usernotice.c", 48);
                                    return 0;
                                }
                                sub_a6c2e4(v13, "crypto/x509/v3_usernotice.c", 0x33);
                                v14 = (unsigned int)v14 + 1;
                            } while ((int)v14 < (int)sub_ad69e4(v9->field_8));
                        }
                    }
                    if (v8->field_8 && (int)sub_9d4888(a2, "\n") < 1)
                        break;
                }
                v16 = v8->field_8;
                if (v16 && !(v2 = v16->field_0, v3 = v16->field_8, v0 = v7, v1 = &g_c7c2eb, !(sub_9d524c(a2, "%*sExplicit Text: %.*s") >> 31 & 1)) || (int)sub_9d4888(a2, "\n\n") <= 0)
                    break;
                v6 = (unsigned int)v6 + 1;
                if ((int)v6 >= (int)sub_ad69e4(a1))
                    return 1;
            }
        }
        else
        {
            return 1;
        }
    }
LABEL_aeee20:
    return 0;
}
