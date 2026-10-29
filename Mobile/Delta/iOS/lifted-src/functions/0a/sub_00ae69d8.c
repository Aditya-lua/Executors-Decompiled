/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae69d8..0xae6c10 (568 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae69d8_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[4];
    unsigned int field_14;
    unsigned int field_18;
    unsigned int field_1c;
    unsigned int field_20;
} st_ae69d8_0;

extern unsigned long long g_c7c2eb;

int sub_ae69d8(unsigned long a0, st_ae69d8_0 *a1, long long a2, unsigned long long a3)
{
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a1->field_0)
        sub_ae7138(a2);
    if (a1->field_8)
        sub_ae7210(a2, "Reasons");
    if (a1->field_14)
    {
        v0 = a3;
        v1 = &g_c7c2eb;
        if ((int)sub_9d524c(a2, "%*sIndirect CRL: ") >= 1 && (int)sub_9d4888() >= 1 && (int)sub_9d4888(a2, "\n") >= 1)
            goto LABEL_ae6a98;
    }
    else
    {
LABEL_ae6a98:
        if (a1->field_18)
        {
            v0 = a3;
            v1 = &g_c7c2eb;
            if ((int)sub_9d524c(a2, "%*sContains User Attribute Certificates: ") >= 1 && (int)sub_9d4888() >= 1 && (int)sub_9d4888(a2, "\n") >= 1)
                goto LABEL_ae6b0c;
        }
        else
        {
LABEL_ae6b0c:
            if (a1->field_1c)
            {
                v0 = a3;
                v1 = &g_c7c2eb;
                if ((int)sub_9d524c(a2, "%*sContains Attribute Authority (AA) Certificates: ") >= 1 && (int)sub_9d4888() >= 1 && (int)sub_9d4888(a2, "\n") >= 1)
                    goto LABEL_ae6b80;
            }
            else
            {
LABEL_ae6b80:
                if (!a1->field_20)
                {
LABEL_ae6bf0:
                    return 1;
                }
                v0 = a3;
                v1 = &g_c7c2eb;
                if ((int)sub_9d524c(a2, "%*sContains Source Of Authority (SOA) Public Key Certificates: ") >= 1 && (int)sub_9d4888() >= 1 && (int)sub_9d4888(a2, "\n") >= 1)
                    goto LABEL_ae6bf0;
            }
        }
    }
    return 0;
}
