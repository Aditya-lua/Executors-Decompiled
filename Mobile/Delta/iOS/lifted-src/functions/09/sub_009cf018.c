/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cf018..0x9cf0c8 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cf018_0 {
    int field_0;
    unsigned int field_4;
    long long field_8;
    unsigned long long field_10;
} st_9cf018_0;


int sub_9cf018(long long a0, st_9cf018_0 *a1, unsigned long a2)
{
    unsigned long long v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a1->field_4 == 3)
    {
        v0 = a1->field_10 & 7;
        if (1 <= (int)sub_9d524c(a0, " (%ld unused bits)\n"))
            goto LABEL_9cf084;
    }
    else if ((int)sub_9d4888(a0, "\n") >= 1)
    {
LABEL_9cf084:
        if (a1->field_0 < 1 || (int)sub_9d395c(a0, a1->field_8) >= 1)
            return 1;
    }
    return 0;
}
